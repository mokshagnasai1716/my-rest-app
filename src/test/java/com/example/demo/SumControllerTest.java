package com.example.demo;

import com.example.demo.controller.SumController;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SumControllerTest {

    private final SumController controller = new SumController();

    @Test
    void testSum() {
        String response = controller.getSum(5, 10);
        assertThat(response).isEqualTo("The product of 5 and 10 is 50");
    }
}
