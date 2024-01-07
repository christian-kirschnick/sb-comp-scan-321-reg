package com.example.demo.feature2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class LoadFeature2ViaConfigAndCompScanTest {

    @Autowired(required = false)
    Feature2 feature2;

    @Test
    void initializesContext() {
        assertThat(feature2).isNotNull();
    }

}