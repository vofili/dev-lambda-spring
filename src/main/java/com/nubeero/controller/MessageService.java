package com.nubeero.controller;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public Message sayHelloMessage(String input){
        Message msg = Message.builder().messageBody(
                "Hello there ,"+input
        ).sendTo("Val Jr")
                .subject("Greetings").build();

        return msg;
    }

    public Message sayHiMessage(String input){
        Message msg = Message.builder().messageBody(
                        "Hi there ,"+input
                ).sendTo("Val Ofili")
                .subject("Greetings").build();

        return msg;
    }
}
