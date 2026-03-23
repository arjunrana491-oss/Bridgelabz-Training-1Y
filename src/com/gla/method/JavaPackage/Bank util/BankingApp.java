
package com.gla.JavaPackages.bank.util;

public class BankingApp {

    public static void main(String[] args) {

        double principal = 50000;
        double rate = 5;
        double time = 3;

        InterestCalculator calc = new InterestCalculator();

        double si = calc.calculateSimpleInterest(principal, rate, time);
        double ci = calc.calculateCompoundInterest(principal, rate, time);

        System.out.println("--- Interest Calculation ---");
        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Simple Interest: " + si);
        System.out.println("Compound Interest: " + ci);
    }
}
