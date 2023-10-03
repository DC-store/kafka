package com.DeliveryBoyApp.kafkaConfi;

import com.DeliveryBoyApp.ConstantsPack.AppConstants;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfiguraitionCls {



    @Bean
    public NewTopic topic(){
        return TopicBuilder.name(AppConstants.LOCATION_TOPIC_NAME).build();
    }
}
