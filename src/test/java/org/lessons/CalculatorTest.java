package org.lessons;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void add() {
        float res = Calculator.add(2.0f, 3.0f);
        assertEquals(5.0f, res);
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        float res = Calculator.subtract(5.0f, 2.0f);
        assertEquals(3.0f, res);
    }

    @org.junit.jupiter.api.Test
    void divide() {
        float res = Calculator.divide(10.0f, 2.0f);
        assertEquals(5.0f, res);
        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(4.0f, 0.0f));
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        float res = Calculator.multiply(5.0f, 5.0f);
        assertEquals(25.0f, res);
    }
}