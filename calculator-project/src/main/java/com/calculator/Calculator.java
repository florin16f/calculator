package com.calculator;

import com.calculator.operation.Operation;
import com.calculator.operation.OperationFactory;

import javax.naming.spi.ObjectFactory;
import java.math.BigDecimal;

public class Calculator {

    public BigDecimal evaluateExpression(String expression) {
        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();
        char operand = 0;
        char[] operands = expression.toCharArray();
        for (int i = 0; i < operands.length; i++) {
            i = getNumber(first, operands, i);
            if (i < operands.length) {
                operand = operands[i];
                i++;
            }
            i = getNumber(second, operands, i);
        }

        BigDecimal firstNumber = new BigDecimal(first.toString());
        BigDecimal secondNumber = new BigDecimal(String.valueOf(second.toString()));
        OperationFactory objectFactory = OperationFactory.getInstance();
        Operation operation = objectFactory.createOperation(operand);
        return operation.calculate(firstNumber, secondNumber);
    }

    private int getNumber(StringBuilder first, char[] operands, int i) {
        while (i < operands.length && Character.isDigit(operands[i])) {
            first.append(operands[i]);
            i++;
        }
        return i;
    }
}
