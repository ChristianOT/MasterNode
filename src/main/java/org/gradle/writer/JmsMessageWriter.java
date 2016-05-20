package org.gradle.writer;

import java.util.List;

import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.config.SimpleJmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

@Service
public class JmsMessageWriter implements ItemWriter<List<String>> {

	@Autowired
	ConfigurableApplicationContext context;

	@Bean
	JmsListenerContainerFactory<?> myJmsContainerFactory(ConnectionFactory connectionFactory) {
		SimpleJmsListenerContainerFactory factory = new SimpleJmsListenerContainerFactory();
		factory.setConnectionFactory(connectionFactory);
		return factory;
	}
	
	private Integer messageCounter = 0;
	private Integer answerCounter = 0;
	private JmsTemplate jmsTemplate;

	public JmsTemplate getJmsTemplate() {
		return jmsTemplate;
	}

	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	@Override
	public void write(List<? extends List<String>> items) throws Exception {
		System.out.println("########### Creating Message ###########");
		for (List<String> mss : items) {
			for (String ms : mss) {
				messageCounter++;
				MessageCreator messageCreator = new MessageCreator() {
					public Message createMessage(Session session) throws JMSException {
						return session.createTextMessage(ms);
					}
				};
				System.out.println("Sending message.");
				jmsTemplate.send("yoink-request", messageCreator);
				System.out.println("Waiting for answer.");
//				if (messageCounter==mss.size())
//					receiveMessage();
			}
		}
		
	}

	@JmsListener(destination="mailbox-answer",containerFactory = "myJmsContainerFactory")
	public void receiveMessage(String answer){
		answerCounter++;
		System.out.println("******** Job done ************ " + answer);
		if (messageCounter==answerCounter)
			context.close();
	}
}
