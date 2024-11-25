package com.hospitalmanagement.hospitalmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import services.UserService;

@Controller
public class UserController {
    @Autowired
    private UserService Userservice;
   @GetMapping("/") 
   public String viewHomePage(Model model) {
      model.addAttribute("listusers", Userservice.getAllUsers());
      return "usindex";
   }
}
