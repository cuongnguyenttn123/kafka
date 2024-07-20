package com.example.kafka;

import com.example.kafka.dto.MessageDTO;
import com.example.kafka.dto.NotificationDTO;
import com.example.kafka.service.abcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    abcService service;

    @PostMapping
    public String getTemplateKafka(@RequestBody MessageDTO messageDTO) {

        NotificationDTO notificationDTO = new NotificationDTO();
        notificationDTO.setMessage(messageDTO.getContent());
        notificationDTO.setTitle(messageDTO.getRecipient());
        notificationDTO.setRecipient(messageDTO.getRecipient());

        service.asysc(notificationDTO);
        return "Done";

    }
}
