package org.gradle.main;

import java.io.File;

import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.gradle.config.BatchConfig;
import org.gradle.dataBaseRepositories.MyObjectRepository;
import org.gradle.domain.MyObject;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.config.SimpleJmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.util.FileSystemUtils;

@SpringBootApplication
@Import(BatchConfig.class)
@EnableJms
@EntityScan("org.gradle")
@EnableJpaRepositories("org.gradle.dataBaseRepositories")
public class MasterNode {
	
	private static final Log log = LogFactory.getLog(MasterNode.class);
	private int jobCounter = 0;
	
	/*---- Autowired ----*/

	@Autowired
	ConfigurableApplicationContext context;

	@Autowired
	MyObjectRepository mor;
	
	/*---- Sending JMS message to SlaveNode ----*/
	//@Autowired
    public void createJobMessage() {
		System.out.println("########### Creating Message ###########");
		for (MyObject m : mor.findAll()) {
			MessageCreator messageCreator = new MessageCreator() {
				public Message createMessage(Session session) throws JMSException {
					String string = mor.findOne(m.getId()).getId().toString();
					return session.createTextMessage(string);
				}
			};
			JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);
			int j = m.getId().intValue();
			log.info("Sending message " + j + ".");
			jmsTemplate.send("mailbox-destination", messageCreator);
			j++;
			log.info("Waiting for answer.");
		}
	}

	/*---- Beans ----*/

	@Bean
	ConnectionFactory connectionFactory() {
		ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
		connectionFactory.setBrokerURL("tcp://rigel.uni-muenster.de:61616");
		return connectionFactory;
	}

	@Bean
	JmsListenerContainerFactory<?> myJmsContainerFactory(ConnectionFactory connectionFactory) {
		SimpleJmsListenerContainerFactory factory = new SimpleJmsListenerContainerFactory();
		factory.setConnectionFactory(connectionFactory);
		return factory;
	}


	/*---- Waiting for JMS message from SlaveNode ----*/
	//@JmsListener(destination = "mailbox-answer", containerFactory = "myJmsContainerFactory", concurrency="1")
	public void receiveMessage(String message) throws JMSException, InterruptedException {
		jobCounter++;
		Long l = Long.parseLong(message);
		log.info("#---------- Getting answer: " + l.toString() + ". ----------#");
		if (jobCounter == mor.findAll().size() - 1)
			context.close();
		//Thread.sleep(1000);
		FileSystemUtils.deleteRecursively(new File("activemq-data"));
	}

	/*---- Main ----*/
	@SuppressWarnings("unused")
	public static void main(String[] args) throws UnexpectedInputException, ParseException, Exception {

		ConfigurableApplicationContext context = SpringApplication.run(MasterNode.class, args);
	
	}

}
