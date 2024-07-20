package com.example.kafka.service;

import com.example.kafka.dto.NotificationDTO;
import com.google.gson.Gson;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ReceiverMessage {

    @KafkaListener(topics = "notification", groupId = "iA4X7bE0m6xJf8S5lT2C")
    public void listenNotification1(String message) {

        System.out.println("");
        Gson gson = new Gson();
        var o = gson.fromJson(message, NotificationDTO.class);
        System.out.println(o.getTitle());
        System.out.println("");
    }

    @KafkaListener(topics = "notification", groupId = "iA4X7bE0m6xJf8S5lT2C")
    public void listenNotification2(String message) {

        System.out.println("");
        System.out.println("==========================================");
        System.out.println("listenNotification 2222222222222: " + message);
        System.out.println("==========================================");
        System.out.println("");
    }

    @KafkaListener(topics = "statistic", groupId = "iA4X7bE0m6xJf8S5lT2C")
    public void listenStatistic(String message) {
        System.out.println("");
        System.out.println("==========================================");
        System.out.println("listenStatistic: " + message);
        System.out.println("==========================================");
        System.out.println("");
    }
}
