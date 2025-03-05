package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach MyCoach;
    private Coach anotherOne;

    @Autowired
    public DemoController(@Qualifier("CricketCoach") Coach theCoach) {
        System.out.println("In contructor: " + getClass().getSimpleName());
        MyCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return MyCoach.getDailyWorkout();
    }

}