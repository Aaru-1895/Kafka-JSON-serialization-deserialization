package com.kafka.controller;

import com.kafka.entity.Customer;
import com.kafka.service.KafkaMessagePublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer-app")
public class EventController {

    @Autowired
    private KafkaMessagePublisher kafkaMessagePublisher;

    @PostMapping("/publish")
    public void sendEvent(@RequestBody Customer customer){
        kafkaMessagePublisher.sendEventsToTopic(customer);
    }
}
