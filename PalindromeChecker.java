package com.gla.ClassObject.Level2;

public class PalindromeChecker {
    private String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean checkPalindrome() {
        String reverse = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reverse = reverse + text.charAt(i);
        }
        return text.equals(reverse);
    }

    public void displayResult() {
        if (checkPalindrome()) {
            System.out.println(text + " is a Palindrome");
        } else {
            System.out.println(text + " is NOT a Palindrome");
        }
    }

    public static void main(String[] args) {
        PalindromeChecker p1 = new PalindromeChecker("madamm");
        p1.displayResult();
    }
}
