package com.todo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Backend is running successfully!";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}

