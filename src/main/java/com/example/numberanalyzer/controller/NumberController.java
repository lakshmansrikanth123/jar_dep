package com.example.numberanalyzer.controller;

import com.example.numberanalyzer.service.NumberService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class NumberController {

    private final NumberService service;

    public NumberController(NumberService service) {
        this.service = service;
    }

    @GetMapping("/analyze/{number}")
    public Map<String, Object> analyze(@PathVariable int number) {

        Map<String, Object> result = new HashMap<>();
        result.put("number", number);
        result.put("isPrime", service.isPrime(number));
        result.put("factorial", service.factorial(number));
        result.put("isArmstrong", service.isArmstrong(number));
        result.put("fibonacci", service.fibonacci(number));

        return result;
    }
}
