package com.gla.string.level3;

import java.util.Scanner;

public class FirstNonRepeating {

    static char findFirstNonRepeating(String text) {
        int[] freq = new int[256];

        for (int i = 0; ; i++) {
            try {
                char ch = text.charAt(i);
                freq[ch]++;
            } catch (Exception e) {
                break;
            }
        }

        for (int i = 0; ; i++) {
            try {
                char ch = text.charAt(i);
                if (freq[ch] == 1)
                    return ch;
            } catch (Exception e) {
                break;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        char result = findFirstNonRepeating(text);

        if (result != '\0')
            System.out.println(result);
        else
            System.out.println("No Non-Repeating Character");
    }
}
