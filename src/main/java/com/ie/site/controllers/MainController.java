package com.ie.site.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String getHomePage(){
        return "/homePage";
    }

    @GetMapping("/receiveConsultation")
    public String getReceiveConsultation(){
        return "/receiveConsultation";
    }
}
