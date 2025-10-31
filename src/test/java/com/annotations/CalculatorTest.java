package com.annotations;

import com.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Calculator Operations Test")
public class CalculatorTest {

    @DisplayName("Test Addition of Two Numbers")
    @Test
    void addTest(){
        Calculator calculator = new Calculator();
        int addition = calculator.add(10, 20);

        assertEquals(30, addition);
    }

    @DisplayName("Test Subtraction of Two Numbers \uD83D\uDE0E")
    @Test
    void subtractTest(){
        Calculator calculator = new Calculator();
        int subtract = calculator.subtract(30, 10);

        assertEquals(20, subtract);
    }

    @DisplayName("Test Multiplication of Two Numbers \uD83D\uDE01")
    @Test
    void multiplyTest(){
        Calculator calculator = new Calculator();
        int multiply = calculator.multiply(30, 10);

        assertEquals(300, multiply);
    }

    @DisplayName("Test Division of Two Numbers @#$%")
    @Test
    void divisionTest(){
        Calculator calculator = new Calculator();
        int divide = calculator.divide(30, 3);

        assertEquals(10, divide);
    }




}
