package com.gla.encapsulation;

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private int productId;
    private String name;
    private double price;

    Product(int productId,String name,double price) {
        this.productId=productId;
        this.name=name;
        this.price=price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId=productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price=price;
    }

    abstract double calculateDiscount();
}

class Electronics extends Product implements Taxable {
    Electronics(int id,String name,double price) {
        super(id,name,price);
    }

    double calculateDiscount() {
        return getPrice()*0.10;
    }

    public double calculateTax() {
        return getPrice()*0.18;
    }

    public String getTaxDetails() {
        return "Electronics Tax: 18%";
    }
}

class Clothing extends Product implements Taxable {
    Clothing(int id,String name,double price) {
        super(id,name,price);
    }

    double calculateDiscount() {
        return getPrice()*0.15;
    }

    public double calculateTax() {
        return getPrice()*0.05;
    }

    public String getTaxDetails() {
        return "Clothing Tax: 5%";
    }
}

class Groceries extends Product {
    Groceries(int id,String name,double price) {
        super(id,name,price);
    }

    double calculateDiscount() {
        return getPrice()*0.05;
    }
}

public class EcommerceTest {

    public static void printFinalPrice(Product[] products) {
        for(Product p:products) {
            double price=p.getPrice();
            double discount=p.calculateDiscount();
            double tax=0;

            if(p instanceof Taxable) {
                tax=((Taxable)p).calculateTax();
            }

            double finalPrice=price+tax-discount;

            System.out.println("Product: "+p.getName());
            System.out.println("Base Price: "+price);
            System.out.println("Discount: "+discount);
            System.out.println("Tax: "+tax);
            System.out.println("Final Price: "+finalPrice);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Product[] products=new Product[3];

        products[0]=new Electronics(101,"Laptop",60000);
        products[1]=new Clothing(102,"T-Shirt",2000);
        products[2]=new Groceries(103,"Rice",1000);

        printFinalPrice(products);
    }
}