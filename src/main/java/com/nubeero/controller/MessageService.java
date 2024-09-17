package com.nubeero.controller;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public Message sayHelloMessage(String input){
        Message msg = Message.builder().messageBody(
                "Hello there ,"+input
        ).sendTo("valentine")
                .subject("Greetings").build();

        return msg;
    }
}
