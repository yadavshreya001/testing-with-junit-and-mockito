package com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void add(){
        Calculator calc = new Calculator();
        int actualResult = calc.add(10,20);

        assertEquals(30,actualResult);  // assertEquals() --> It’s used in unit testing to check if two values are equal.
    }

}

