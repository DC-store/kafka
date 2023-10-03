package com.DeliveryBoyApp.ControllerPkg;

import com.DeliveryBoyApp.ServicePackage.KafkaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class LocationController {

    private Logger logger = LoggerFactory.getLogger(LocationController.class.getName());

    @Autowired
    public KafkaService kafkaService;


    @PostMapping("/update")
    public ResponseEntity<?> updateLocation(){
        logger.info("Service info url is triggering this api");
        this.kafkaService.updateLOcation("("+Math.random()*100+" ,  "+Math.random()*100);
        return new ResponseEntity<>(Map.of("Message","location updated "), HttpStatus.OK);
    }
}
