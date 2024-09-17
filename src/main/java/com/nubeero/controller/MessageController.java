package com.nubeero.controller;


import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/message")
public class MessageController {

    MessageService messageService;

    @GetMapping("/hello/{name}")
    public ResponseEntity<Message> sayHelloMessage(@PathVariable("name") String inputName){
         Message msg = messageService.sayHelloMessage(inputName);
         return ResponseEntity.ok(msg);
    }

    @GetMapping("/hi/{name}")
    public ResponseEntity getHiMessage(@PathVariable ("name") String inputName){
        Message msgObj = messageService.sayHiMessage(inputName);
        return ResponseEntity.ok(msgObj);
    }




}
