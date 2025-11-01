package com.annotations;

import com.Calculator;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderCalculatorTest {

    @Order(1)
    @Test
    void addTest(){
        Calculator calculator = new Calculator();
        int addition = calculator.add(10, 20);
        assertEquals(30, addition);
    }

    @Order(2)
    @Test
    void subtractTest(){
        Calculator calculator = new Calculator();
        int subtract = calculator.subtract(30, 10);
        assertEquals(20, subtract);
    }

    @Order(3)
    @Test
    void multiplyTest(){
        Calculator calculator = new Calculator();
        int multiply = calculator.multiply(30, 10);
        assertEquals(300, multiply);
    }

    @Order(4)
    @Test
    void divisionTest(){
        Calculator calculator = new Calculator();
        int divide = calculator.divide(30, 3);
        assertEquals(10, divide);
    }
}
