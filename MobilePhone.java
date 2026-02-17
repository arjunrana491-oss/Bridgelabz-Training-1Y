package com.gla.ClassObject.Level1;

public class MobilePhone {
    private String brand;
    private String model;
    private int price;

    public MobilePhone(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void showPhoneDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MobilePhone m1 = new MobilePhone("iPhone", "13", 49999);

        System.out.println("Mobile Phone Details:");
        m1.showPhoneDetails();
    }
}

