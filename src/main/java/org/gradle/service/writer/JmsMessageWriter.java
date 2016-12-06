package org.gradle.service.writer;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

/**
 * ItemWriter for sending the id of an entry in the database to a jms queue. For
 * masterStep.
 *
 * @author Christian Ouali Turki
 */
public class JmsMessageWriter {

    private Integer messageCounter = 0;

    private JmsTemplate jmsTemplate;

    public JmsMessageWriter() {
    }

    public JmsMessageWriter(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    /*
         * send a message for every String in List<String>
         */
    public void write(String message) throws Exception {
        messageCounter++;
        MessageCreator messageCreator = session -> session.createTextMessage(message);
        jmsTemplate.send("request", messageCreator);
        System.out.println("Waiting for answer.");
    }

    public void setJmsTemplate(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

}
