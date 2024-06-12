package com.diviso.helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Value("${spring.application.name}")
    String appName;

    @GetMapping("/")
    public String a() {
        return "Hello World from " + appName;
    }
}
