package com.mmc.app.platform.Controllers;

import com.mmc.app.platform.Configs.LeadGenerationConfig;
import com.mmc.app.platform.Models.LeadGeneration;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LeadGenerationController {

    @Autowired
    RabbitTemplate rabbitTemplate;


    @PostMapping("/leadgeneration")
    public String LeadGenerationPublisher(@RequestBody List<LeadGeneration> leadGenerations){
//        System.out.println(leadGenerations);
        try {
            rabbitTemplate.convertAndSend(LeadGenerationConfig.LeadGenerationExchange, LeadGenerationConfig.LeadGenerationRouteKey, leadGenerations);
        } catch (Exception exception){
            return  "connection not established please connect to rabbit mq server";
        }

        return "Data sent to the rabbitmq";
    }
}
