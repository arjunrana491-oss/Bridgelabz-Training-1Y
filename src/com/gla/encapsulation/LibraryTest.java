package com.gla.encapsulation;

interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;
    private boolean available=true;

    LibraryItem(int itemId,String title,String author) {
        this.itemId=itemId;
        this.title=title;
        this.author=author;
    }

    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailability(boolean available) {
        this.available=available;
    }

    abstract int getLoanDuration();

    void getItemDetails() {
        System.out.println("Item ID: "+itemId);
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Available: "+available);
    }
}

class Book extends LibraryItem implements Reservable {
    private String borrower;

    Book(int id,String title,String author) {
        super(id,title,author);
    }

    int getLoanDuration() {
        return 14;
    }

    public void reserveItem(String borrowerName) {
        if(isAvailable()) {
            borrower=borrowerName;
            setAvailability(false);
            System.out.println("Book reserved by "+borrower);
        } else {
            System.out.println("Book not available");
        }
    }

    public boolean checkAvailability() {
        return isAvailable();
    }
}

class Magazine extends LibraryItem implements Reservable {
    private String borrower;

    Magazine(int id,String title,String author) {
        super(id,title,author);
    }

    int getLoanDuration() {
        return 7;
    }

    public void reserveItem(String borrowerName) {
        if(isAvailable()) {
            borrower=borrowerName;
            setAvailability(false);
            System.out.println("Magazine reserved by "+borrower);
        } else {
            System.out.println("Magazine not available");
        }
    }

    public boolean checkAvailability() {
        return isAvailable();
    }
}

class DVD extends LibraryItem implements Reservable {
    private String borrower;

    DVD(int id,String title,String author) {
        super(id,title,author);
    }

    int getLoanDuration() {
        return 5;
    }

    public void reserveItem(String borrowerName) {
        if(isAvailable()) {
            borrower=borrowerName;
            setAvailability(false);
            System.out.println("DVD reserved by "+borrower);
        } else {
            System.out.println("DVD not available");
        }
    }

    public boolean checkAvailability() {
        return isAvailable();
    }
}

public class LibraryTest {
    public static void main(String[] args) {
        LibraryItem[] items=new LibraryItem[3];

        items[0]=new Book(101,"Java Programming","James Gosling");
        items[1]=new Magazine(102,"Tech Today","Editor Team");
        items[2]=new DVD(103,"Learning Java","Tech Studio");

        for(LibraryItem item:items) {
            item.getItemDetails();
            System.out.println("Loan Duration: "+item.getLoanDuration()+" days");

            if(item instanceof Reservable) {
                Reservable r=(Reservable)item;
                System.out.println("Available: "+r.checkAvailability());
                r.reserveItem("Rahul");
            }

            System.out.println();
        }
    }
}