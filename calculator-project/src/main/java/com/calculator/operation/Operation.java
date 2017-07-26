package com.calculator.operation;

import java.math.BigDecimal;

/**
 * Created by flori on 26/02/2017.
 */
public interface Operation {

    BigDecimal calculate(BigDecimal first, BigDecimal second);
}
