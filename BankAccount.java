package com.gla.ClassObject.Level2;

public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Abhay", "ACC12345", 5000);

        System.out.println("ATM Simulation:");

        b1.displayBalance();
        b1.deposit(2000);
        b1.displayBalance();
        b1.withdraw(3000);
        b1.displayBalance();
        b1.withdraw(6000);
    }
}
