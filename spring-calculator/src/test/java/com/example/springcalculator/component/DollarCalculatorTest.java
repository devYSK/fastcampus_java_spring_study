package com.example.springcalculator.component;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;

import static org.mockito.Mockito.when;

@Import({MarketApi.class, DollarCalculator.class})
@SpringBootTest
public class DollarCalculatorTest {

    @MockBean // 스프링에서는 빈으로 관리하기 떄문
    private MarketApi marketApi;

    @Autowired
    private Calculator calculator;


    @Test
    public void dollarCalculatorTest() {
        when(marketApi.connect()).thenReturn(3000);

        int sum = calculator.sum(10, 10);
        int minus = calculator.minus(10, 10);
        Assertions.assertEquals(60000, sum);
        Assertions.assertEquals(0, minus);
    }
}


