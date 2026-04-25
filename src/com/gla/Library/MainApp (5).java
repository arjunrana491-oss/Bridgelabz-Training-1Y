package com.gla.StoryBasedQuestions.library;

public class MainApp {

    public static void main(String[] args) {

        Book b1 = new TextBook(101, "Java Programming", 500);
        Book b2 = new Magazine(201, "Tech Monthly", 200);

        b1.display();
        System.out.println("Fine: " + b1.calculateFine(3));

        b2.display();
        System.out.println("Fine: " + b2.calculateFine(3));
    }
}