package com.hospitalmanagement.hospitalmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String hospital(){
        return "login";
    }
    @PostMapping("/login")
    public String showLoginPage(){
        return "login";
    }
    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }
    @PostMapping("/contact")
    public String contact1(){
        return "contact";
    }
}
