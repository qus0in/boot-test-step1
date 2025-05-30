package org.example.bootteststep1.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

// JUnit, AssertJ
// JUnit ***
@DisplayName("계산기 테스트")
public class CalculatorTest {
    private Calculator calculator;
    private Logger logger;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        System.out.println("각 테스트 전에 실행");
        logger = LoggerFactory.getLogger(getClass());
        logger.info("각 테스트 전에 실행");
    }

    @Test
    @DisplayName("두 수를 더해서 합계 변환")
    void add() {
        // Given (주어진 상황)
        int a = 5;
        int b = 3;
        // When (행위)
        int result = calculator.add(a, b);
        // Then (기대 결과)
        assertEquals(8, result); // throw vs assert
    }

    @Test
    @DisplayName("두 수를 더해서 합계 변환")
    void add2() {
        // Given (주어진 상황)
        int a = new Random().nextInt(100);
        int b = new Random().nextInt(100);
        // When (행위)
        int result = calculator.add(a, b);
        // Then (기대 결과)
        assertEquals(a + b, result);
    }

}
