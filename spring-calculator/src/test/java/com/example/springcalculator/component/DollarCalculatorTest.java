package com.example.springcalculator.component;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;

@Import(MarketApi.class)
public class DollarCalculatorTest {

    @MockBean // 스프링에서는 빈으로 관리하기 떄문 
    private MarketApi marketApi;
}
