package com.example.testenv;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppConfig {
    @RequestMapping("/hello")

    public String hello()
    {
        return "Hello World!";
    }


}
