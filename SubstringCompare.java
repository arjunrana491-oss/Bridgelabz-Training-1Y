package com.gla.string;
import java.util.Scanner;
public class SubstringCompare {
    static String substringUsingCharAt(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }
    static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        String subCharAt = substringUsingCharAt(text, start, end);
        String subBuiltIn = text.substring(start, end);
        boolean result = compareUsingCharAt(subCharAt, subBuiltIn);
        System.out.println(subCharAt);
        System.out.println(subBuiltIn);
        System.out.println(result);
    }
}

