package com.parameterized;

import com.Days;
import com.MathUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EnumSourceDemoTest {

    @ParameterizedTest
    @EnumSource(value = Days.class, names = {"MONDAY", "TUESDAY", "SUNDAY", "THURSDAY", "FRIDAY"})
    void isWeekdayTest(Days day){
        MathUtils mathUtils = new MathUtils();
        assertTrue(mathUtils.isWeekday(day));
    }

}
