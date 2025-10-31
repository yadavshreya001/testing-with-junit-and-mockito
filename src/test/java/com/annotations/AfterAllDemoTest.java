package com.annotations;

import com.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AfterAllDemoTest {

    private static Calculator calculator;

    @BeforeAll
    static void setupBeforeClass(){
        calculator = new Calculator();
        System.out.println("setupBeforeClass() method called...");
    }

    @AfterAll
    static void tearDownAfterClass(){
        calculator = null;
        System.out.println("tearDownAfterClass() method called...");
    }

    @Test
    void addTest(){
        int addition = calculator.add(10, 20);
        assertEquals(30, addition);
        System.out.println("addTest() executed");
    }

    @Test
    void subtractTest(){
        int subtract = calculator.subtract(30, 10);
        assertEquals(20, subtract);
        System.out.println("subtractTest() executed");
    }

    @Test
    void multiplyTest(){
        int multiply = calculator.multiply(30, 10);
        assertEquals(300, multiply);
        System.out.println("multiplyTest() executed");
    }

    @Test
    void divisionTest(){
        int divide = calculator.divide(30, 3);
        assertEquals(10, divide);
        System.out.println("divisionTest() executed");
    }

}
