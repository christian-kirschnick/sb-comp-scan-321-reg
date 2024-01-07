package com.example.demo.feature1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class LoadFeature1ViaComponentScanTest {

    @Autowired(required = false)
    Feature1 feature1;

    @Test
    void initializesContext() {
        assertThat(feature1).isNotNull();
    }

}
