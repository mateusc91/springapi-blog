package com.example.springapiazure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class SpringApiAzureApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringApiAzureApplication.class, args);
    }

    @GetMapping("/test")
    public String getMessage(){
        return "API running!";
    }

}
