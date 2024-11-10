package com.totoy4.totoy_be.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class healthCheck {
    public healthCheck() {}

    @GetMapping("/health")
    public String healthCheck() {
        return "good";
    }
}
