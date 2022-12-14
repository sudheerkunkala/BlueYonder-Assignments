package com.springReactive.employeeService.config;

import com.springReactive.employeeService.model.EmployeeRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.reactive.ReactiveKafkaConsumerTemplate;
import reactor.kafka.receiver.ReceiverOptions;

import java.util.Collections;

//@Configuration
public class ReactiveKafkaConsumerConfig {
//    @Bean
//    public ReceiverOptions<String, EmployeeRequest> kafkaReceiverOptions(@Value(value = "${CONSUMER_TOPIC}") String topic, KafkaProperties kafkaProperties) {
//        ReceiverOptions<String, EmployeeRequest> basicReceiverOptions = ReceiverOptions.create(kafkaProperties.buildConsumerProperties());
//        return basicReceiverOptions.subscription(Collections.singletonList(topic));
//    }
//
//    @Bean
//    public ReactiveKafkaConsumerTemplate<String, EmployeeRequest> reactiveKafkaConsumerTemplate(ReceiverOptions<String, EmployeeRequest> kafkaReceiverOptions) {
//        return new ReactiveKafkaConsumerTemplate<String, EmployeeRequest>(kafkaReceiverOptions);
//    }
}
