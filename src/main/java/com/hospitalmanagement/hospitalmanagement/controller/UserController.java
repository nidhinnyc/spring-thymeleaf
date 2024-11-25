package com.hospitalmanagement.hospitalmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import repository.UserRepository;
import services.UserService;

@Controller
public class UserController {
   @Autowired
   private UserService Userservice;

   @Autowired
   private UserRepository userRepository;

   @GetMapping("/")
   public String viewHomePage(Model model) {
      model.addAttribute("listusers", Userservice.getAllUsers());
      return "usindex";
   }
}
