package org.gradle.service.writer;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import java.util.List;

/**
 * ItemWriter for sending the id of an entry in the database to a jms queue. For
 * masterStep.
 *
 * @author Christian Ouali Turki
 */
@Service
public class JmsMessageWriter implements ItemWriter<List<String>> {

    @Autowired
    ConfigurableApplicationContext context;

    private Integer messageCounter = 0;

    private JmsTemplate jmsTemplate;

    /*
     * send a message for every String in List<String>
     */
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
                jmsTemplate.send("request", messageCreator);
                System.out.println("Waiting for answer.");
                // if (messageCounter==mss.size())
                // receiveMessage();
            }
        }
    }

    public JmsTemplate getJmsTemplate() {
        return jmsTemplate;
    }

    public void setJmsTemplate(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

}
