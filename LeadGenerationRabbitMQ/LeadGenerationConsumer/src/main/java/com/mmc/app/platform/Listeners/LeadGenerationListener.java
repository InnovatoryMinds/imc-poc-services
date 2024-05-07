package com.mmc.app.platform.Listeners;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.mmc.app.platform.Configs.LeadGenerationConfig;
import com.mmc.app.platform.Models.LeadGeneration;

@Component
public class LeadGenerationListener {

    public static Logger logger = LoggerFactory.getLogger(LeadGenerationListener.class);

    @RabbitListener(queues = LeadGenerationConfig.LeadGenerationQueue)
    public void LeadGen(List<LeadGeneration> leadGenerations) {
        logger.info("Lead Generation List");
        for (LeadGeneration lead : leadGenerations) {
            logger.info("lead generation details" + lead);
        }
    }
}
