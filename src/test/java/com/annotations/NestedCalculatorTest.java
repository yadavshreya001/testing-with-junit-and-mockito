package com.annotations;

import com.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NestedCalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp(){
        calculator = new Calculator();
        System.out.println("setUp() called...");
    }

    @Nested
    class AdditionTest{
        @Test
        public void testAddPositiveNumbers(){
            assertEquals(70, calculator.add(30, 40));
        }

        @Test
        public void testAddPositiveAndNegativeNumbers(){
            assertEquals(20, calculator.add(40, -20));
        }

        @Test
        public void testAddNegativeNumbers(){
            assertEquals(-60, calculator.add(-40, -20));
        }
    }

    @Nested
    class SubtractionTest{
        @Test
        public void testSubtractPositiveNumbers(){
            assertEquals(20, calculator.subtract(40, 20));
        }

        @Test
        public void testSubtractLargerFromSmallerNumbers(){
            assertEquals(-10, calculator.subtract(10, 20));
        }

        @Nested
        class edgeCases{
            @Test
            public void testSubtractZero(){
                assertEquals(2, calculator.subtract(2,0));
            }
        }
    }
}
