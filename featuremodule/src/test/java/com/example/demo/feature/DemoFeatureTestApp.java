package com.example.demo.feature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("disabled")
@EnableDemoFeature
public class DemoFeatureTestApp {

    public static void main(String[] args) {
        SpringApplication.run(DemoFeatureTestApp.class, args);
    }

}
