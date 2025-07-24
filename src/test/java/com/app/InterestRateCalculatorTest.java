package com.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class InterestRateCalculatorTest {

    @Test
    public void testCalculateInterest_Success() {
        InterestRateCalculator calculator = new InterestRateCalculator();

        double amount = 1000;
        int time = 5;
        int rate = 5;

        double expectedValue = (amount * time * rate) / 100.0;
        double result = calculator.calculateInterest(amount, time);

        assertEquals(expectedValue, result);
    }

    @Test
    public void testCalculateInterest_WhenLoanExceeded() {
        InterestRateCalculator calculator = new InterestRateCalculator();

        double amount = 2000;
        int time = 5;
        int rate = 5;

        double expectedValue = (amount * time * rate) / 100.0;

        assertThrows(RuntimeException.class, () -> {
            calculator.calculateInterest(amount, time);
        });

    }

}
