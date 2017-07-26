package com.calculator.operation;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by flori on 26/02/2017.
 */
public class OperationFactory {

    private static OperationFactory operationFactory;
    private Map<Character, Operation> operationMap = new LinkedHashMap<>();

    private OperationFactory() {
        completeOperations();
    }

    public static OperationFactory getInstance() {
        if (operationFactory == null) {
            operationFactory = new OperationFactory();
        }
        return operationFactory;
    }

    private void completeOperations() {
        operationMap.put('+', new AddOperation());
        operationMap.put('-', new SubtractOperation());
        operationMap.put('*', new MultiplicationOperation());
        operationMap.put('/', new DivisionOperation());
    }

    public Operation createOperation(char operator) {
        Operation operation = operationMap.get(operator);
        if (operation == null) {
            throw new OperationException("Operator unknow");
        }
        return operation;
    }
}
