package com.mmc.app.platform.Configs;

import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.amqp.core.*;

@Configuration
public class LeadGenerationConfig {

    public static  final String LeadGenerationQueue  = "lead generation queue";
    public  static final String LeadGenerationExchange ="lead exchange";
    public  static  final String LeadGenerationRouteKey = "lead generation queue route key";


    @Bean
    public Queue LeadGenQueue(){
        return  new Queue(LeadGenerationQueue);
    }

    @Bean
    public  TopicExchange topicExchange(){
        return  new TopicExchange(LeadGenerationExchange);
    }

    @Bean
    public  Binding LeadGenBinding(){
        return BindingBuilder.bind(LeadGenQueue()).to(topicExchange()).with(LeadGenerationRouteKey);
    }

    @Bean
    public MessageConverter messageConverter(){
        return  new Jackson2JsonMessageConverter();
    }

    @Bean
    public AmqpTemplate template(ConnectionFactory connectionFactory){
        return new RabbitTemplate(connectionFactory);
    }
}

