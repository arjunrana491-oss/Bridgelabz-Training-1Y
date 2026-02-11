package com.gla.string;

import java.util.Scanner;
public class IllegalArgumentDemo{
    static void generateException(String text){
        text.substring(5,2);
    }
    static void handleException(String text){
        try{
            text.substring(5,2);
        }catch(IllegalArgumentException e){
            System.out.println("IllegalArgumentException handled");
        }catch(RuntimeException e){
            System.out.println("RuntimeException handled");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String text=sc.next();
        try{
            generateException(text);
        }catch(RuntimeException e){
            System.out.println("Exception generated");
        }
        handleException(text);
    }
}
