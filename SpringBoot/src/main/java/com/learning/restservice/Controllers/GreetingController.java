package com.learning.restservice.Controllers;

import com.learning.restservice.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting getGreeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format("Hello %s!", name));
    }


}
