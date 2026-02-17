package com.gla.ClassObject.Level2;

public class CartItem {
    private String itemName;
    private int price;
    private int quantity;

    public CartItem(String itemName, int price) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = 0;
    }

    public void addItem(int qty) {
        quantity = quantity + qty;
        System.out.println(qty + " item(s) added to cart");
    }

    public void removeItem(int qty) {
        if (qty <= quantity) {
            quantity = quantity - qty;
            System.out.println(qty + " item(s) removed from cart");
        } else {
            System.out.println("Not enough items in cart to remove");
        }
    }

    public void displayTotalCost() {
        int totalCost = price * quantity;
        System.out.println("Item Name: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost);
    }

    public static void main(String[] args) {
        CartItem c1 = new CartItem("Book", 200);

        c1.addItem(3);
        c1.displayTotalCost();

        c1.removeItem(1);
        c1.displayTotalCost();
    }
}
