package com.rconnect.r_connect.controllers;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String showHomePage(Model uiModel){
        uiModel.addAttribute("userName", "Zainab");
        uiModel.addAttribute("location", "<i>Colombo</i>");
        uiModel.addAttribute("userType", "Agent");

        List<String> propertyList = new ArrayList<>();
        propertyList.add("Shri Villa");
        propertyList.add("Gamage Villa");
        propertyList.add("Lotus Villa");
        propertyList.add("Nilum Villa");

        uiModel.addAttribute("propertyList", propertyList);



        return "/fragment/index";
    }
}