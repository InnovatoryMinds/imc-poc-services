package com.mmc.app.platform.Listeners;

import java.util.List;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.mmc.app.platform.Configs.LeadGenerationConfig;
import com.mmc.app.platform.Models.LeadGeneration;

@Component
public class LeadGenerationListener {

    @RabbitListener(queues = LeadGenerationConfig.LeadGenerationQueue)
    public void LeadGen(List<LeadGeneration> leadGenerations) {

        System.out.println("LeadGeneration List");
        System.out.println("-----------------------------------------------------");
        for (LeadGeneration lead : leadGenerations) {
            System.out.println(lead);
        }
        System.out.println("-----------------------------------------------------");
    }
}