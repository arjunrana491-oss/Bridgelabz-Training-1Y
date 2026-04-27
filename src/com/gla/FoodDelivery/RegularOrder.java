package com.gla.StoryBasedQuestions.FoodDelivery;

class RegularOrder extends Order {

    RegularOrder(int orderId, double baseAmount) {
        super(orderId, baseAmount);
    }

    double calculateBill() {
        return baseAmount + deliveryCharge;
    }
}