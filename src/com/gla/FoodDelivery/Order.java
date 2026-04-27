package com.gla.StoryBasedQuestions.FoodDelivery;

class Order {

    int orderId;
    double baseAmount;

    static int deliveryCharge = 40;

    Order(int orderId, double baseAmount) {
        this.orderId = orderId;
        this.baseAmount = baseAmount;
    }

    double calculateBill() {
        return baseAmount + deliveryCharge;
    }
}