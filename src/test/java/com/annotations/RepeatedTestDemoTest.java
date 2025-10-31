package com.annotations;

import com.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepeatedTestDemoTest {

    @BeforeEach
    void setUp(){
        System.out.println("setUp() calling...");
    }
    @AfterEach
    void tearDown(){
        System.out.println("tearDown() calling...");
    }

    @BeforeAll
    static void setupBeforeClass(){
        System.out.println("setupBeforeClass() method called...");
    }

    @AfterAll
    static void tearDownAfterClass(){
        System.out.println("tearDownAfterClass() method called...");
    }

    @RepeatedTest(value = 5, name = RepeatedTest.LONG_DISPLAY_NAME)
    @DisplayName("Test Addition Repeatedly")
    void addTest(){
        Calculator calculator = new Calculator();
        int addition = calculator.add(10, 20);
        assertEquals(30, addition);
    }
}

