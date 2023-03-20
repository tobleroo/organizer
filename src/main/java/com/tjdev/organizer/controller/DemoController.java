package com.tjdev.organizer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class DemoController {

    @GetMapping("/demo")
    public String demoPage(Principal principal){

        return "hello there! " + principal.getName();
    }

}
