package com.luv2code.springboot.start.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ToyRest {
    @GetMapping("/")
    public List<String> getToy(){
        return List.of("teddy","doggy","car");
    }
}
