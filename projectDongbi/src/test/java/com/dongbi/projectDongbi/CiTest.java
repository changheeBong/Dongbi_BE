package com.dongbi.projectDongbi;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

public class CiTest {

    @Test
    public void ciTEst() throws Exception{
        Assertions.assertThat(2).isEqualTo(1);
    }
}
