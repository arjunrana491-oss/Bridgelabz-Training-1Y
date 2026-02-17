package com.gla.ClassObject.Level1;

public class Item {
    private String itemCode;
    private String itemName;
    private int price;

    public Item(String itemCode, String itemName, int price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void showItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: " + price);
    }

    public int calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Item i1 = new Item("I101", "Notebook", 50);

        System.out.println("Item Details:");
        i1.showItemDetails();

        int quantity = 5;
        int totalCost = i1.calculateTotalCost(quantity);

        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost);
    }
}
