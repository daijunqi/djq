package com.mq;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * Created by dai on 16-8-26.
 */
public class Sender {

    public static void main(String[] args){
        ConnectionFactory factory;

        Connection connection;

        Session session;

        Destination destination;

        MessageProducer producer;

        factory = new ActiveMQConnectionFactory(ActiveMQConnectionFactory.DEFAULT_USER,
                ActiveMQConnectionFactory.DEFAULT_PASSWORD,"tcp://localhost:61616");

        try {
            connection = factory.createConnection();

            session = connection.createSession(true,Session.AUTO_ACKNOWLEDGE);

            destination = session.createQueue("helloWorld");

            producer = session.createProducer(destination);

            sendMessage(session, producer);

            session.commit();

        }catch (Exception e){

        }
    }

    private static void sendMessage(Session session, MessageProducer producer) throws Exception{
        for(int i=0; i<10; i++) {
            TextMessage message = session.createTextMessage("hello" + i);
            producer.send(message);
            System.out.println(i);
        }
    }
}
