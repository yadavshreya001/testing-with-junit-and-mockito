package com.parameterized;

import com.MathUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValueSourceDemoTest {

    @ParameterizedTest
    @ValueSource(ints = {2,4,8,10,11})
    void isEvenTest(int number){
        MathUtils mathUtils = new MathUtils();
        assertTrue(mathUtils.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(strings = {"John", "Mary", "Peter"})
    void valueSourceTest(String parameter){
        assertNotNull(parameter);
    }

}
