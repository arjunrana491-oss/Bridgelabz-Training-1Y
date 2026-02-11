package com.gla.string.level3;

import java.util.Scanner;

public class AnagramCheck {

    static boolean isAnagram(String text1, String text2) {

        if (text1.length() != text2.length())
            return false;

        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        for (int i = 0; i < text1.length(); i++) {
            char ch1 = text1.charAt(i);
            char ch2 = text2.charAt(i);

            freq1[ch1]++;
            freq2[ch2]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text1 = sc.nextLine();
        String text2 = sc.nextLine();

        if (isAnagram(text1, text2))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}
