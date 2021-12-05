package com.example.testenv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TestEnvApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(TestEnvApplication.class, args);
        Customer c = context.getBean(Customer.class);
        c.display();
    }

}
