package com.example.thekary.clonecoding.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/index.html")
    public String mainPage(){
        return "index";
    }

    @GetMapping("/about_mis.html")
    public String aboutMission(){
        return "about-mis";
    }

    @GetMapping("/about_vis.html")
    public String aboutVision(){
        return "about-vis";
    }

    @GetMapping("/about_val.html")
    public String aboutValue(){
        return "about-val";
    }

    @GetMapping("/about_history.html")
    public String aboutHistory(){
        return "about-history";
    }

    @GetMapping("/about_ci.html")
    public String aboutCI(){
        return "about-ci";
    }

}
