package org.codingsquid.isolation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @GetMapping(value = "/healthCheck")
    public String healthCheck() {
        return "i'm running";
    }
}
