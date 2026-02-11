package com.gla.string.level3;

import java.util.Scanner;

public class PalindromeCheck {

    static boolean isPalindromeLogic1(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    static boolean isPalindromeLogic2(String text, int start, int end) {
        if (start >= end)
            return true;

        if (text.charAt(start) != text.charAt(end))
            return false;

        return isPalindromeLogic2(text, start + 1, end - 1);
    }

    // Helper for Logic 3: reverse using charAt()
    static char[] reverseString(String text) {
        int len = text.length();
        char[] rev = new char[len];

        for (int i = 0; i < len; i++) {
            rev[i] = text.charAt(len - 1 - i);
        }
        return rev;
    }

    static boolean isPalindromeLogic3(String text) {
        char[] original = text.toCharArray();
        char[] reverse = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        System.out.println("Logic 1 Result: " + isPalindromeLogic1(text));
        System.out.println("Logic 2 Result: " +
                isPalindromeLogic2(text, 0, text.length() - 1));
        System.out.println("Logic 3 Result: " + isPalindromeLogic3(text));

    }
}
