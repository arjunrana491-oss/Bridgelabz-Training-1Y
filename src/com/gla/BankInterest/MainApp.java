package com.gla.StoryBasedQuestions.BankInterest;

class MainApp {

    public static void main(String[] args) {

        Account a1 = new SavingsAccount(101, 10000);
        Account a2 = new CurrentAccount(102, 10000);

        System.out.println("Bank: " + Account.bankName);

        System.out.println("Savings Interest: " + a1.calculateInterest());
        System.out.println("Current Interest: " + a2.calculateInterest());
    }
}