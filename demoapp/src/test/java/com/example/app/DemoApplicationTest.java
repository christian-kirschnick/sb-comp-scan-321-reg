package com.example.app;

import com.example.demo.feature1.Feature1;
import com.example.demo.feature2.Feature2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class DemoApplicationTest {

    @Autowired(required = false)
    Feature1 feature1;

    @Autowired(required = false)
    Feature2 feature2;

    @Test
    void initializesContext() {
        assertThat(feature1).isNotNull();
        assertThat(feature2).isNotNull();
    }

}
