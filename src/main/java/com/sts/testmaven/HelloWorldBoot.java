package com.sts.testmaven;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
//@ComponentScan(basePackages="com.sts")
public class HelloWorldBoot extends SpringBootServletInitializer  {
	
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldBoot.class, args);
        
        
    }

    
}