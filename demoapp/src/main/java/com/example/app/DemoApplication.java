package com.example.app;

import com.example.demo.feature1.EnableFeature1ViaComponentScan;
import com.example.demo.feature2.EnableFeature2ViaImportConfigPlusComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableFeature1ViaComponentScan
@EnableFeature2ViaImportConfigPlusComponentScan
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
