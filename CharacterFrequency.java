package com.gla.string.level3;

import java.util.Scanner;

public class CharacterFrequency {

    static String[][] findFrequency(String text) {
        int[] freq = new int[256];

        for (int i = 0; ; i++) {
            try {
                char ch = text.charAt(i);
                freq[ch]++;
            } catch (Exception e) {
                break;
            }
        }

        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0)
                count++;
        }

        String[][] result = new String[count][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(freq[i]);
                index++;
            }
        }
        return result;
    }

    static void display(String[][] data) {
        System.out.println("Character\tFrequency");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[][] result = findFrequency(text);
        display(result);

        sc.close();
    }
}
