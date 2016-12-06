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
import org.springframework.util.FileSystemUtils;

import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import java.io.File;

/**
 * Configuration file handling the jms communication from the master node to the slave nodes.
 * Created by christian on 06/12/2016.
 */
@Profile("mNode")
@Configuration
@EnableJms
public class MasterConfig {

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
        jmsTemplate.setDefaultDestinationName("yoink-request");
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
     * JmsListener, that is waiting for messages to arrive in the respond queue. The
     * message is printed out in the console. Concurrency is set to 1, but can be increased
     * to get more messages at once from the queue. The messages will than also be processed
     * concurrently.
     *
     * @param message
     * @throws JMSException
     * @throws InterruptedException
     */
    @JmsListener(destination = "respond", containerFactory = "myJmsContainerFactory", concurrency = "1")
    public void receiveMessage(String message) {
        System.out.println("Getting answer: " + message + ".");
        FileSystemUtils.deleteRecursively(new File("activemq-data"));
    }

}
