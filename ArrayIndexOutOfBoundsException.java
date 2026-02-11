package com.gla.string;

import java.util.Scanner;
public class ArrayIndexOutOfBoundsException{
    static void generateException(String[] arr){
        System.out.println(arr[arr.length]);
    }
    static void handleException(String[] arr){
        try{
            System.out.println(arr[arr.length]);
        }catch(java.lang.ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException handled");
        }catch(RuntimeException e){
            System.out.println("RuntimeException handled");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] names=new String[n];
        for(int i=0;i<n;i++){
            names[i]=sc.next();
        }
        try{
            generateException(names);
        }catch(RuntimeException e){
            System.out.println("Exception generated");
        }
        handleException(names);
        sc.close();
    }
}


