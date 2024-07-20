package com.example.kafka.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class MessageDTO implements Serializable {
    private String sender;
    private String recipient;
    private String content;

}
