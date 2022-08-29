package com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAddition() {
        assertEquals(5, Calculator.calculate(2, 3, '+'));
    }

    @Test
    void testSubtraction() {
        assertEquals(10, Calculator.calculate(20, 10, '-'));
    }


    @Test
    void testMultiplication() {
        assertEquals(100, Calculator.calculate(10, 10, '*'));
    }

    @Test
    void testDivision() {
        assertEquals(1, Calculator.calculate(10, 10, '/'));
    }
}