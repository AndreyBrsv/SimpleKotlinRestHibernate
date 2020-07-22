package io.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthCheck {

    @GetMapping("/health")
    fun healthCheck() : String {
        return "It's ok!";
    }
}