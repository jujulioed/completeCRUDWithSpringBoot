package com.jujulioed.med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthcheck")
public class HealthCheck {

    @GetMapping
    public String healthCheck() {
        return "<h1>The application is running! :)</h1>";
    }
}
