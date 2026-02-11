package com.gla.string;

public class NullPointerDemo {
    static void generateException() {
        String text = null;
        text.length();
    }
    static void handleException() {
        String text = null;
        try {
            text.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }
    }
    public static void main(String[] args) {
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception generated");
        }
        handleException();
    }
}

