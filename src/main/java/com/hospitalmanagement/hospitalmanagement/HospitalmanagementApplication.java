package com.hospitalmanagement.hospitalmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages = "com.hospitalmanagement.services")
@SpringBootApplication
public class HospitalmanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalmanagementApplication.class, args);
	}

}
