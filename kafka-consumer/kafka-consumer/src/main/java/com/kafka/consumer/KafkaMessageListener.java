package com.kafka.consumer;

import com.kafka.entity.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener  {
    Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = "kafka-demo",groupId = "ad-group")
    public void consumeEvents(Customer customer) {
        log.info("consumer consume the events {} ", customer.toString());
    }

   /* @Override
    public Customer deserialize(String s, byte[] bytes) {
        log.info("consumer consume the events... {} ", s);
        return null;
    }*/
}
