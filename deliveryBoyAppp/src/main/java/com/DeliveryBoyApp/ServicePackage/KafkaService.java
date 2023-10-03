package com.DeliveryBoyApp.ServicePackage;

import com.DeliveryBoyApp.ConstantsPack.AppConstants;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    private Logger logger = LoggerFactory.getLogger(KafkaService.class.getName());

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;



    public boolean updateLOcation(String  location){
        this.kafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME,location);
        this.logger.info("message produced-------------------------");
        return true;
    }
}
