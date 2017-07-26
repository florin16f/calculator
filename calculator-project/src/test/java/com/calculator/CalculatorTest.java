package com.calculator;

import com.calculator.operation.OperationException;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        assertEquals(BigDecimal.valueOf(6),calculator.evaluateExpression("2+4"));
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        assertEquals(BigDecimal.valueOf(2),calculator.evaluateExpression("4-2"));
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        assertEquals(BigDecimal.valueOf(8),calculator.evaluateExpression("4*2"));
    }

    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();
        assertEquals(BigDecimal.valueOf(2),calculator.evaluateExpression("4/2"));
    }

    @Test(expected = OperationException.class)
    public void testUnknowOperator() {
        Calculator calculator = new Calculator();
        calculator.evaluateExpression("4$2");
    }
    @Test
    public void testSumWithTwoDecimals() {
        Calculator calculator = new Calculator();
        assertEquals(BigDecimal.valueOf(66),calculator.evaluateExpression("44+22"));
    }
}
