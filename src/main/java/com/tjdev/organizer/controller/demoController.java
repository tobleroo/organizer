package com.tjdev.organizer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {

    @GetMapping("/demo")
    public String demoPage(){
        return "hello ther!";
    }
}
