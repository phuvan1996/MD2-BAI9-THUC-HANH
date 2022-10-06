package bai9_thuchanh2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class absoluteNumberTest {

    @Test
    void getAbsoluteNumberTest() {
        int number = 1;
        int expected = 1;
        int result = absoluteNumber.getAbsoluteNumber(number);
        assertEquals(expected,result);
    }
    @Test
    void getAbsoluteNumberTest1() {
        int number = 0;
        int expected = 0;
        int result = absoluteNumber.getAbsoluteNumber(number);
        assertEquals(expected,result);
    }
    @Test
    void getAbsoluteNumberTest2() {
        int number = -1;
        int expected = 1;
        int result = absoluteNumber.getAbsoluteNumber(number);
        assertEquals(expected,result);
    }
}