package com.gla.encapsulation;

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    FoodItem(String itemName,double price,int quantity) {
        this.itemName=itemName;
        this.price=price;
        this.quantity=quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity=quantity;
    }

    abstract double calculateTotalPrice();

    void getItemDetails() {
        System.out.println("Item: "+itemName);
        System.out.println("Price: "+price);
        System.out.println("Quantity: "+quantity);
    }
}

class VegItem extends FoodItem implements Discountable {
    VegItem(String name,double price,int quantity) {
        super(name,price,quantity);
    }

    double calculateTotalPrice() {
        return getPrice()*getQuantity();
    }

    public double applyDiscount() {
        return calculateTotalPrice()*0.10;
    }

    public String getDiscountDetails() {
        return "Veg Item Discount: 10%";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    NonVegItem(String name,double price,int quantity) {
        super(name,price,quantity);
    }

    double calculateTotalPrice() {
        double base=getPrice()*getQuantity();
        double extra=base*0.05;
        return base+extra;
    }

    public double applyDiscount() {
        return calculateTotalPrice()*0.05;
    }

    public String getDiscountDetails() {
        return "Non-Veg Discount: 5%";
    }
}

public class FoodDeliveryTest {

    public static void processOrder(FoodItem[] items) {
        for(FoodItem item:items) {
            item.getItemDetails();

            double total=item.calculateTotalPrice();
            double discount=0;

            if(item instanceof Discountable) {
                Discountable d=(Discountable)item;
                discount=d.applyDiscount();
                System.out.println(d.getDiscountDetails());
            }

            double finalPrice=total-discount;

            System.out.println("Total Price: "+total);
            System.out.println("Discount: "+discount);
            System.out.println("Final Price: "+finalPrice);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        FoodItem[] order=new FoodItem[2];

        order[0]=new VegItem("Paneer Pizza",300,2);
        order[1]=new NonVegItem("Chicken Burger",250,3);

        processOrder(order);
    }
}