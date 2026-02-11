package com.gla.string;
import java.util.Scanner;
public class StringCompare {
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
        String str1 = sc.next();
        String str2 = sc.next();
        boolean resultCharAt = compareUsingCharAt(str1, str2);
        boolean resultEquals = str1.equals(str2);
        System.out.println(resultCharAt);
        System.out.println(resultEquals);
        System.out.println(resultCharAt == resultEquals);
    }
}
