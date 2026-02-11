package com.gla.string;

import java.util.Scanner;
public class UpperCaseConversion{
    static String toUpperUsingCharAt(String text){
        String result="";
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(ch>='a' && ch<='z'){
                result+=(char)(ch-32);
            }else{
                result+=ch;
            }
        }
        return result;
    }
    static boolean compareStrings(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        String userUpper=toUpperUsingCharAt(text);
        String builtInUpper=text.toUpperCase();
        boolean result=compareStrings(userUpper,builtInUpper);
        System.out.println(userUpper);
        System.out.println(builtInUpper);
        System.out.println(result);
    }
}
