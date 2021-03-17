package com.revature.config;

import java.sql.Connection;

import java.util.Scanner;

import javax.jms.ConnectionFactory;
import javax.jms.Queue;
import javax.jms.Topic;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Scope;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.connection.SingleConnectionFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.listener.DefaultMessageListenerContainer;

import com.revature.messaging.JmsMessageListener;
import com.revature.util.ConnectionFactoryPostgres;

@Configuration
@ComponentScan("com.revature")
@EnableAspectJAutoProxy
@EnableJms
public class AppConfig {

	public static final String BROKER_URL = "tcp://localhost:61616";

	public static final String EXAMPLE_QUEUE = "EXAMPLE_QUEUE";
	public static final String EXAMPLE_TOPIC = "EXAMPLE_TOPIC";

	@Bean
	@Scope("prototype")
	public Connection conn() {
		return ConnectionFactoryPostgres.getConnection();
	}


	@Bean
	@Scope("singleton")
	public Scanner consoleInScanner() {
		return new Scanner(System.in);
	}

	@Bean
	public Logger log() {
		return Logger.getRootLogger();
	}

	@Bean
	public ActiveMQConnectionFactory amqConnectionFactory() {
		ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(BROKER_URL);
		return connectionFactory;
	}

	@Bean
	public ConnectionFactory connectionFactory(ActiveMQConnectionFactory amqConnectionFactory) {
		return new SingleConnectionFactory(amqConnectionFactory);
	}

	@Bean
	public Queue destinationQueue() {
		return new ActiveMQQueue(EXAMPLE_QUEUE);
	}
	
	@Bean
	public Topic destinationTopic() {
		return new ActiveMQTopic(EXAMPLE_TOPIC);
	}

	// this will allow us to consume messages from the queue, using Spring for help

	@Bean
	public DefaultMessageListenerContainer jmsContainer(ConnectionFactory connectionFactory,
			JmsMessageListener messageListener) {
		DefaultMessageListenerContainer container = new DefaultMessageListenerContainer();
		container.setConnectionFactory(connectionFactory);
//		container.setDestinationName(EXAMPLE_QUEUE);
		container.setDestinationName(EXAMPLE_TOPIC);
		container.setPubSubDomain(true);
		
		container.setMessageListener(messageListener);
		return container;
	}

	// Spring JmsTemplate, makes it easier for us to send messages
	@Bean
	public JmsTemplate jmsTemplate(ConnectionFactory connectionFactory) {
		JmsTemplate template = new JmsTemplate();
		template.setConnectionFactory(connectionFactory);
		
		return template;
	}

}
