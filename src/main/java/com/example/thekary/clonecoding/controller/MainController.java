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

    @GetMapping("/theKary.html")
    public String theKary(){
        return "theKary";

    }

    @GetMapping("/bebe.html")
    public String bebe(){
        return "bebe";
    }

    @GetMapping("/ice.html")
    public String ice(){
        return "ice";

    }

    @GetMapping("/nunu.html")
    public String nunu(){
        return "nunu";
    }

    @GetMapping("/social.html")
    public String social(){
        return "social";
    }

    @GetMapping("/donation.html")
    public String donation(){
        return "donation";
    }


    @GetMapping("/childfund.html")
    public String childFund(){
        return "childfund";
    }

    @GetMapping("/gfoundation.html")
    public String gFoundation(){
        return "gfoundation";
    }

    @GetMapping("/santa.html")
    public String santa(){
        return "santa";
    }

    @GetMapping("/recruit.html")
    public String recruit(){
        return "recruit";
    }







}
