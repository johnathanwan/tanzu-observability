package com.example.tanzuobservability

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController {

    @GetMapping("/")
    fun home() = "Hello World"
}