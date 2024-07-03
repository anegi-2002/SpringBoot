package com.ingenico.m360.testingproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class basicController {

    @GetMapping("/")
    public String helloWorld(){
        return "Hello World!!!!!!!";
    }

}
