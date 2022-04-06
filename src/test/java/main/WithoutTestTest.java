package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithoutTestTest {

    @Test
    void test_calculate() {
        int number1 = 10;
        int number2 = 2;

        String addition = WithoutTest.calculate(number1, number2, '+');
        assertEquals("12", addition);

        String subtraction = WithoutTest.calculate(number1, number2, '-');
        assertEquals("8", subtraction);

        String multiply = WithoutTest.calculate(number1, number2, '*');
        assertEquals("20", multiply);

        String division = WithoutTest.calculate(number1, number2, '/');
        assertEquals("5", division);

        String other = WithoutTest.calculate(number1, number2, 'a');
        assertEquals("", other);
    }

    @Test
    void test_isPrime() {
        assertTrue(WithoutTest.isPrime(2));
        assertTrue(WithoutTest.isPrime(3));
        assertTrue(WithoutTest.isPrime(7));
        assertTrue(WithoutTest.isPrime(11));
        assertTrue(WithoutTest.isPrime(Integer.MAX_VALUE));

        assertFalse(WithoutTest.isPrime(0));
        assertFalse(WithoutTest.isPrime(1));
        assertFalse(WithoutTest.isPrime(-2));
        assertFalse(WithoutTest.isPrime(9));
        assertFalse(WithoutTest.isPrime(25));
    }

    @Test
    void test_checkGender() {
        String gender1 = WithoutTest.checkGender(0);
        assertEquals("nő", gender1);
        String gender2 = WithoutTest.checkGender(1);
        assertEquals("férfi", gender2);
        String gender3 = WithoutTest.checkGender(-1);
        assertEquals("valami más", gender3);
        String gender4 = WithoutTest.checkGender(2);
        assertEquals("valami más", gender4);

    }

    @Test
    void test_trafficLight() {
        String light1 = WithoutTest.trafficLight("zöld");
        assertEquals("SZABAD", light1);
        String light2 = WithoutTest.trafficLight("sárga");
        assertEquals("LASSÍTS", light2);
        String light3 = WithoutTest.trafficLight("piros");
        assertEquals("MEGÁLLJ", light3);
        String light4 = WithoutTest.trafficLight("zold");
        assertEquals("NEM TUDOM", light4);
    }

    @Test
    void test_isLeapYear() {
        assertTrue(WithoutTest.isLeapYear(1584));
        assertTrue(WithoutTest.isLeapYear(1588));
        assertTrue(WithoutTest.isLeapYear(1604));
        assertTrue(WithoutTest.isLeapYear(2004));
        assertTrue(WithoutTest.isLeapYear(1600));
        assertTrue(WithoutTest.isLeapYear(2000));

        assertFalse(WithoutTest.isLeapYear(1578));
        assertFalse(WithoutTest.isLeapYear(1700));
        assertFalse(WithoutTest.isLeapYear(0));




    }

}