package org.gradle.writer;

import java.util.List;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

@Service
public class JmsMessageWriter implements ItemWriter<String> {

	@Autowired
	ConfigurableApplicationContext context;
	
	private JmsTemplate jmsTemplate;

	public JmsTemplate getJmsTemplate() {
		return jmsTemplate;
	}

	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	@Override
	public void write(List<? extends String> items) throws Exception {
		System.out.println("########### Creating Message ###########");
		MessageCreator messageCreator = new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(items.toString());
			}
		};
		System.out.println("Sending message.");
		jmsTemplate.send("yoink-request", messageCreator);
		System.out.println("Waiting for answer.");
	}

}
