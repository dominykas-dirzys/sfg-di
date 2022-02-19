package com.dominykas.sfgdi.controllers;

import com.dominykas.sfgdi.services.GreetingService;
import org.springframework.stereotype.Component;

@Component
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {

        return greetingService.sayGreeting();
    }
}
