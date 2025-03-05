package com.luv2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component("CricketCoach")
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("In contructor: " + getClass().getSimpleName());
    }

    // define init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("In doMyStartupStuff(): " +getClass().getSimpleName());
    }

    // define our destroy method
    @PostConstruct
    public void doMyCleanupStuff(){
        System.out.println("In doMyCleanupStuff(): " +getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Do workout for daily 15min gooo";
    }
}
