package org.gradle.config;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.gradle.service.writer.JmsMessageWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.config.SimpleJmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.jms.ConnectionFactory;

/**
 * Configuration file handling the jms communication from a slave node to the master node.
 * Created by christian on 06/12/2016.
 */
@Profile("sNode")
@Configuration
@EnableJms
public class SlaveConfig {

    @Autowired
    private ConfigurableApplicationContext context;

    @Value("${broker.url}")
    private String brokerURL;

    /**
     * Setting the ConnectionFactory for jms communication.
     *
     * @return a ConnectionFactory
     */
    @Bean
    public ConnectionFactory connectionFactory() {
        return new ActiveMQConnectionFactory("tcp://" + brokerURL);
    }

    /**
     * ListenerContainerFactory for listening to jms queues.
     *
     * @param connectionFactory
     * @return JmsListenerContainerFactory
     */
    @Bean
    public JmsListenerContainerFactory<?> myJmsContainerFactory(ConnectionFactory connectionFactory) {
        SimpleJmsListenerContainerFactory factory = new SimpleJmsListenerContainerFactory();
        factory.setConnectionFactory(connectionFactory);
        return factory;
    }

    /**
     * Configuration of the JmsTemplate allowing interaction with jms
     * queues. The name of the queue is set with
     * jmsTemplate.setDefaultDestinationName("name of the queue")
     *
     * @return jmsTemplate
     */
    @Bean
    public JmsTemplate jmsTemplate() {
        JmsTemplate jmsTemplate = new JmsTemplate();
        jmsTemplate.setConnectionFactory(connectionFactory());
        jmsTemplate.setDefaultDestinationName("respond");
        return jmsTemplate;
    }

    /**
     * Setting the ItemWriter for masterStep as a {@link org.gradle.service.writer.JmsMessageWriter}.
     * Needs JmsTemplate to interact with jms queues.
     *
     * @return itemWriter
     */
    @Bean
    public JmsMessageWriter jmsMessageWriter() {
        return new JmsMessageWriter(jmsTemplate());
    }

    /**
     * JmsListener, that is waiting for messages to arrive in the request queue. The
     * message contatins the id or name of a molecular system to be processed.
     * Concurrency is set to 1, but can be increased to get more messages at once from the queue.
     * The messages will than also be processed concurrently.
     *
     * @param message
     * @throws Exception
     */
    @JmsListener(destination = "request", containerFactory = "myJmsContainerFactory", concurrency = "1")
    public void receiveMessage(String message) throws Exception {
        System.out.println("Received " + message);
        /**     INSERT TASK     **/
        System.out.println("Job done. Sending answer.");
        createAnswer("Done with Id " + message);
    }

    public void createAnswer(final String string) {
        MessageCreator messageCreator = session -> session.createTextMessage(string);
        JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);
        jmsTemplate.send("respond", messageCreator);
    }
}
