package com.gla.StoryBasedQuestions.FoodDelivery;

public class MainApp {

    public static void main(String[] args) {

        Order o1 = new RegularOrder(101, 500);
        Order o2 = new PremiumOrder(102, 500);

        System.out.println("Regular Order Bill: " + o1.calculateBill());
        System.out.println("Premium Order Bill: " + o2.calculateBill());
    }
}