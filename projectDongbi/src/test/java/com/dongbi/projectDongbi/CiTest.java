package com.dongbi.projectDongbi;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CiTest {

    @Test
    public void ciTest() throws Exception{
        int n = 2;

        Assertions.assertThat(n).isEqualTo(1); 
    }
}
