package com.calculator.operation;

import java.math.BigDecimal;

/**
 * Created by flori on 26/02/2017.
 */
public class MultiplicationOperation implements Operation {

    public BigDecimal calculate(BigDecimal first, BigDecimal second) {
        return first.multiply(second);
    }
}
