package com.example.greet_service.controller;

import com.example.greet_service.client.WelcomeFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {

    @Autowired
    WelcomeFeignClient welcomeFeignClient;

    @GetMapping("/greet")
    public String getGreetMsg() {

        String msg = "Good Morning ";
        return msg +
                welcomeFeignClient.getWelcomeMsg();
    }

    @GetMapping("/hello")
    public String getHelloMsg() {

        return "Hello";
    }
}
