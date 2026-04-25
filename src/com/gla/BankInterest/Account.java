package com.gla.StoryBasedQuestions.BankInterest;

public class Account {

    int accountNumber;
    double balance;

    static String bankName = "ABC Bank";

    Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    double calculateInterest() {
        return 0;
    }
}