package com.harry.winser.spring.boot.java.biscuit.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BiscuitController {

    @GetMapping("/biscuits")
    public String getAll() {

        return "hello dave";
    }

}
