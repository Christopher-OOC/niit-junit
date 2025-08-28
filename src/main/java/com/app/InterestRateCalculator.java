package com.app;

public class InterestRateCalculator {

    public double calculateInterest(double amount, int time) {
        // i = prt / 100;
        if (time > 20) {
            throw new RuntimeException("You time is > 20 ( " + amount + " )");
        }

        if (amount > 1000) {
            throw new RuntimeException("You can't loan the amount ( " + amount + " )");
        }

        return (amount * time * 5) / 100.0;
    }
}
