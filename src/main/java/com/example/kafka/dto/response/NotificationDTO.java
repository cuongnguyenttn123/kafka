package com.example.kafka.dto.response;

import lombok.Data;

import java.io.Serializable;

@Data
public class NotificationDTO implements Serializable {
    private String title;
    private String message;
    private String recipient;
}
