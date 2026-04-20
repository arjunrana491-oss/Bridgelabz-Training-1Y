package com.gla.InterfacesAbstraction;

public class PasswordValidatorApp {

    interface SecurityUtils {
        static boolean isStrongPassword(String password) {
            if(password.length() < 8) return false;
            boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;
            for(char ch : password.toCharArray()) {
                if(Character.isUpperCase(ch)) hasUpper = true;
                else if(Character.isLowerCase(ch)) hasLower = true;
                else if(Character.isDigit(ch)) hasDigit = true;
                else hasSpecial = true;
            }
            return hasUpper && hasLower && hasDigit && hasSpecial;
        }
    }

    public static void main(String[] args) {
        String password1 = "Abc123!";
        String password2 = "StrongPass@1";

        System.out.println("Password: " + password1 + " is strong? " + SecurityUtils.isStrongPassword(password1));
        System.out.println("Password: " + password2 + " is strong? " + SecurityUtils.isStrongPassword(password2));
    }
}package com.gla.InterfacesAbstraction;

public class PaymentGatewayApp {

    interface PaymentProcessor {
        void pay(double amount);

        default void refund(double amount) {
            System.out.println("Refund of " + amount + " processed by default method.");
        }
    }

    static class UPI implements PaymentProcessor {
        @Override
        public void pay(double amount) {
            System.out.println("Paid " + amount + " via UPI");
        }
    }

    static class CreditCard implements PaymentProcessor {
        @Override
        public void pay(double amount) {
            System.out.println("Paid " + amount + " via Credit Card");
        }

        @Override
        public void refund(double amount) {
            System.out.println("Refund of " + amount + " via Credit Card gateway");
        }
    }

    static class Wallet implements PaymentProcessor {
        @Override
        public void pay(double amount) {
            System.out.println("Paid " + amount + " via Wallet");
        }
    }

    public static void main(String[] args) {
        PaymentProcessor upi = new UPI();
        PaymentProcessor card = new CreditCard();
        PaymentProcessor wallet = new Wallet();

        upi.pay(500);
        card.pay(1200);
        wallet.pay(250);

        System.out.println();

        upi.refund(200);    // Uses default method
        card.refund(500);   // Uses overridden method
        wallet.refund(100); // Uses default method
    }
}package com.gla.InterfacesAbstraction;

public class PaymentGatewayApp {

    interface PaymentProcessor {
        void pay(double amount);

        default void refund(double amount) {
            System.out.println("Refund of " + amount + " processed by default method.");
        }
    }

    static class UPI implements PaymentProcessor {
        @Override
        public void pay(double amount) {
            System.out.println("Paid " + amount + " via UPI");
        }
    }

    static class CreditCard implements PaymentProcessor {
        @Override
        public void pay(double amount) {
            System.out.println("Paid " + amount + " via Credit Card");
        }

        @Override
        public void refund(double amount) {
            System.out.println("Refund of " + amount + " via Credit Card gateway");
        }
    }

    static class Wallet implements PaymentProcessor {
        @Override
        public void pay(double amount) {
            System.out.println("Paid " + amount + " via Wallet");
        }
    }

    public static void main(String[] args) {
        PaymentProcessor upi = new UPI();
        PaymentProcessor card = new CreditCard();
        PaymentProcessor wallet = new Wallet();

        upi.pay(500);
        card.pay(1200);
        wallet.pay(250);

        System.out.println();

        upi.refund(200);    // Uses default method
        card.refund(500);   // Uses overridden method
        wallet.refund(100); // Uses default method
    }
}