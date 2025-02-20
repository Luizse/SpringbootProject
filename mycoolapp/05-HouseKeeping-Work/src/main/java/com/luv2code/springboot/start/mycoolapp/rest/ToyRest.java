package com.luv2code.springboot.start.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ToyRest {

    //inject properties for: guide.name and team.name

    @Value("${guide.name}")
    private String guidename;
    @Value("${team.name}")
    private String teamname;

    //expose new endpoints for "teaminfo"
    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Guide name: " + guidename + ", Team name: " + teamname;
    }

    @GetMapping("/")
    public List<String> getToy(){
        return List.of("teddy","doggy","car");
    }

    @GetMapping("/DailyRoutine")
    public List<String> getDailyworkwout(){
        return List.of("6:30 to 7:30 = workout","8:30 to 9:30 = Study");
    }
    @GetMapping("/workout")
    public String getworkout(){
        return "Yay its sunday workout time";
    }
}
