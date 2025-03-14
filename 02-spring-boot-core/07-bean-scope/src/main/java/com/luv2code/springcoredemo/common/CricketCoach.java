package com.luv2code.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("CricketCoach")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("In contructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Do workout for daily 15min gooo";
    }
}
