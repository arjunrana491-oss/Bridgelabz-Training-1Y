package com.gla.StoryBasedQuestions.FoodDelivery;

class PremiumOrder extends Order {

    PremiumOrder(int orderId, double baseAmount) {
        super(orderId, baseAmount);
    }

    double calculateBill() {
        double discount = baseAmount * 0.20;
        return baseAmount - discount + deliveryCharge;
    }
}