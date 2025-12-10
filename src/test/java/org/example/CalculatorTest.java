package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void prepare() {
        calculator = new Calculator();
    }

    @Test
    public void addTwoPositiveNumbers() {
        double expected = 7.8;
        double actual = calculator.add(3.2, 4.6);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void addTwoNegativeNumbers() {
        double expected = -7.1;
        double actual = calculator.add(-5.6, -1.5);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void addPositiveAndNegativeNumber() {
        double expected = 1.7;
        double actual = calculator.add(3.2, -1.5);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void subtractTwoPositiveNumbers() {
        double expected = -1.4;
        double actual = calculator.subtract(3.2, 4.6);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void subtractTwoNegativeNumbers() {
        double expected = -4.1;
        double actual = calculator.subtract(-5.6, -1.5);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void subtractPositiveAndNegativeNumber() {
        double expected = 4.7;
        double actual = calculator.subtract(3.2, -1.5);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void multiplyTwoPositiveNumbers() {
        double expected = 14.72;
        double actual = calculator.multiply(3.2, 4.6);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void multiplyTwoNegativeNumbers() {
        double expected = 8.4;
        double actual = calculator.multiply(-5.6, -1.5);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void multiplyPositiveAndNegativeNumber() {
        double expected = -4.8;
        double actual = calculator.multiply(3.2, -1.5);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void divideTwoPositiveNumbers() {
        double expected = 0.6957;
        double actual = calculator.divide(3.2, 4.6);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void divideTwoNegativeNumbers() {
        double expected = 3.7333;
        double actual = calculator.divide(-5.6, -1.5);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void dividePositiveAndNegativeNumber() {
        double expected = -2.1333;
        double actual = calculator.divide(3.2, -1.5);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void divideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }
}
