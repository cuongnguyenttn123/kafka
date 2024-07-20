package com.example.kafka.service;

import com.example.kafka.dto.response.NotificationDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaService {
    private final KafkaTemplate<String, Object> kafkaTemplate;

    @Async
    public void asysc(NotificationDTO notificationDTO) {
        extracted(notificationDTO, 1, 999);
        extracted(notificationDTO, 1000, 1999);
        extracted(notificationDTO, 2000, 2999);
    }

    private void extracted(NotificationDTO notificationDTO, int min, int max) {
        for (int i = min; i < max; i++) {

            notificationDTO.setTitle(String.valueOf(i));
            kafkaTemplate.send("notification", notificationDTO);
        }
    }


}
