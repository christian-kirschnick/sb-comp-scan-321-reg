package com.example.app;

import com.example.demo.feature1.Feature1;
import com.example.demo.feature2.Feature2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ApplicationComponent {

    @Autowired
    private Feature1 feature1;

    @Autowired
    private Feature2 feature2;

}
