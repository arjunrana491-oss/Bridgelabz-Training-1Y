package com.gla.StoryBasedQuestions.library;

class Book {

    int bookId;
    String title;
    double price;

    static String libraryName = "Smart Library";

    Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    double calculateFine(int daysLate) {
        return 0;
    }

    void display() {
        System.out.println(bookId + " " + title + " " + price + " " + libraryName);
    }
}