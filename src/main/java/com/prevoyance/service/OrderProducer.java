package com.prevoyance.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.prevoyance.model.OrderRequest;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderProducer {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    @Value("${kafka.topic.name}")
    private String topic;

    public void sendOrder(OrderRequest order) {
        kafkaTemplate.send(topic, order.getOrderId(), order);
        System.out.println("Order produced: " + order);
    }
}
