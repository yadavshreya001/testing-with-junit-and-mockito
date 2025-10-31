package com.annotations;

import com.Calculator;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DisabledCalculatorTest {

    @Test
    void addTest(){
        Calculator calculator = new Calculator();
        int addition = calculator.add(10, 20);

        assertEquals(30, addition);
    }

    @Disabled("Disabled until bug #40 is fixed")
    @Test
    void subtractTest(){
        Calculator calculator = new Calculator();
        int subtract = calculator.subtract(30, 10);

        assertEquals(20, subtract);
    }

    @Test
    void multiplyTest(){
        Calculator calculator = new Calculator();
        int multiply = calculator.multiply(30, 10);

        assertEquals(300, multiply);
    }

    @Disabled("Disabled until bug #49 is fixed")
    @Test
    void divisionTest(){
        Calculator calculator = new Calculator();
        int divide = calculator.divide(30, 3);

        assertEquals(10, divide);
    }
    
}
