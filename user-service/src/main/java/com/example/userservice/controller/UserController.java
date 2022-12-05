package com.example.userservice.controller;

import com.example.userservice.vo.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {
    private Environment env;

    @Autowired
    private Greeting greeting;

    @Autowired
    public UserController(Environment env) {
        this.env = env;
    }

    @GetMapping("/health_check")
    public String status() {
        return "It's Working in User Servcie";
    }

    @GetMapping("/welcome")
    public String welcome() {
        // Case 1:: message 가져오기
        // return env.getProperty("greeting.message");
        // Case 2:: message 가져오기
        return greeting.getMessage();
    }
}
