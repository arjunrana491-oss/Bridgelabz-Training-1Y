package com.gla.string;
import java.util.Scanner;
public class CharArrayCompare {
    static char[] getCharsUsingMethod(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }
    static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length)
            return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        char[] userDefinedArray = getCharsUsingMethod(text);
        char[] builtInArray = text.toCharArray();
        boolean result = compareCharArrays(userDefinedArray, builtInArray);
        for (char c : userDefinedArray)
            System.out.print(c + " ");
        System.out.println();
        for (char c : builtInArray)
            System.out.print(c + " ");
        System.out.println();
        System.out.println(result);

    }
}
