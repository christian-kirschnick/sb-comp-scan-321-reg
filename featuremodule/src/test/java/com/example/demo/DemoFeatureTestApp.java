package com.example.demo;

import com.example.demo.feature1.EnableFeature1ViaComponentScan;
import com.example.demo.feature2.EnableFeature2ViaImportConfigPlusComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("disabled")
@EnableFeature1ViaComponentScan
@EnableFeature2ViaImportConfigPlusComponentScan
public class DemoFeatureTestApp {

    public static void main(String[] args) {
        SpringApplication.run(DemoFeatureTestApp.class, args);
    }

}
