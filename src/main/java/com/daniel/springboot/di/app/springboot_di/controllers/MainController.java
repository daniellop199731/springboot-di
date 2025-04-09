package com.daniel.springboot.di.app.springboot_di.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.springboot.di.app.springboot_di.models.MessageModel;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/main")
public class MainController {

    @PostMapping("/hellow")
    public MessageModel hellow(@RequestBody MessageModel message) {
        message.setMessage(message.getMessage() + " REQ");  
        return message;
    }
    

}
