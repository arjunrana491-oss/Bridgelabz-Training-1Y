package com.gla.encapsulation;

interface Loanable {
    void applyForLoan(double amount);
    double calculateLoanEligibility();
}

abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    BankAccount(int accountNumber,String holderName,double balance) {
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance+=amount;
    }

    public void withdraw(double amount) {
        if(amount<=balance) {
            balance-=amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    abstract double calculateInterest();
}

class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate=0.04;

    SavingsAccount(int acc,String name,double balance) {
        super(acc,name,balance);
    }

    double calculateInterest() {
        return getBalance()*interestRate;
    }

    public void applyForLoan(double amount) {
        System.out.println("Loan applied for: "+amount);
    }

    public double calculateLoanEligibility() {
        return getBalance()*5;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    private double interestRate=0.02;

    CurrentAccount(int acc,String name,double balance) {
        super(acc,name,balance);
    }

    double calculateInterest() {
        return getBalance()*interestRate;
    }

    public void applyForLoan(double amount) {
        System.out.println("Loan applied for: "+amount);
    }

    public double calculateLoanEligibility() {
        return getBalance()*3;
    }
}

public class BankTest {
    public static void main(String[] args) {
        BankAccount[] accounts=new BankAccount[2];

        accounts[0]=new SavingsAccount(101,"Rahul",50000);
        accounts[1]=new CurrentAccount(102,"Neha",70000);

        for(BankAccount acc:accounts) {
            System.out.println("Account Number: "+acc.getAccountNumber());
            System.out.println("Holder Name: "+acc.getHolderName());
            System.out.println("Balance: "+acc.getBalance());

            double interest=acc.calculateInterest();
            System.out.println("Interest: "+interest);

            if(acc instanceof Loanable) {
                Loanable loan=(Loanable)acc;
                System.out.println("Loan Eligibility: "+loan.calculateLoanEligibility());
                loan.applyForLoan(20000);
            }

            System.out.println();
        }
    }
}