package com.example.Spring.Boot.Starter.Introduction.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SorinRestController {

    @GetMapping("/start")
    public String name() {
        return "Sorin Gore 11282358345373875";
    }

}
