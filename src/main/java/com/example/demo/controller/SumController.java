package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumController {

    @GetMapping("/sum")
    public String getSum(@RequestParam int a, @RequestParam int b) {
        int sum = a + b;
        return "The sum of " + a + " and " + b + " is " + sum;
    }
}
