package com.hospitalmanagement.hospitalmanagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hai {
    @GetMapping("/hai")

    public String hello()
{
    return "Hi";
}    


    
    
}
