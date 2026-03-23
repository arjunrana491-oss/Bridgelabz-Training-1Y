
package com.gla.JavaPackages.bank.util;

import static java.lang.Math.*;  // static import for pow()

public class InterestCalculator {

    // Method to calculate Simple Interest
    public double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    // Method to calculate Compound Interest using pow()
    public double calculateCompoundInterest(double principal, double rate, double time) {
        return principal * (pow(1 + rate/100, time)) - principal;
    }
}
