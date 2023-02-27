package com.techelevator;

import junit.framework.TestCase;

import java.math.BigDecimal;

public class MainTest extends TestCase {

    public void testLateFee() {
        int daysLate = 2;
        BigDecimal lateFeePrice = lateFee(daysLate);
        BigDecimal expected = new BigDecimal("3.99");
        int result = lateFeePrice.compareTo(expected);
        assertEquals(0, result);

    }

    private BigDecimal lateFee(int daysLate) {
        if(daysLate == 0) return new BigDecimal("0.00");
        else if(daysLate == 1) return new BigDecimal("1.99");
        else if(daysLate == 2) return new BigDecimal("3.99");
        return new BigDecimal("19.99");
    }
}