package com.example.kafka.service;

import com.example.kafka.dto.response.NotificationDTO;
import com.google.gson.Gson;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ReceiverMessage {

    @KafkaListener(topics = "notification", groupId = "iA4X7bE0m6xJf8S5lT2C")
    public void listenNotification1(String message) {

        Gson gson = new Gson();
        var o = gson.fromJson(message, NotificationDTO.class);

    }

    @KafkaListener(topics = "notification", groupId = "iA4X7bE0m6xJf8S5lT2C")
    public void listenNotification2(String message) {

        System.out.println("listenNotification 2222222222222: " + message);

    }

    @KafkaListener(topics = "statistic", groupId = "iA4X7bE0m6xJf8S5lT2C")
    public void listenStatistic(String message) {
        System.out.println("");
        System.out.println("listenStatistic: " + message);

    }
}
