package com.dongbi;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CiTest {

    @Test
    public void ciTEst() throws Exception{
        Assertions.assertThat(2).isEqualTo(2);
    }
}
