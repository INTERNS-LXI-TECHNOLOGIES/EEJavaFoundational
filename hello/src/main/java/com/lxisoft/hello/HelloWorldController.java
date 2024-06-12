package com.lxisoft.hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Value("${greeting.message}")
    public String name;

    @GetMapping("/helllo")
    public String helloWorld() {
        return "Hello, World!" + name;
    }
}


