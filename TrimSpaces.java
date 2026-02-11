package com.gla.string.level2;

import java.util.Scanner;
public class TrimSpaces{
    static int[] findTrimPoints(String text){
        int start=0;
        int end=text.length()-1;
        while(start<=end && text.charAt(start)==' '){
            start++;
        }
        while(end>=start && text.charAt(end)==' '){
            end--;
        }
        return new int[]{start,end+1};
    }
    static String substringUsingCharAt(String text,int start,int end){
        String result="";
        for(int i=start;i<end;i++){
            result+=text.charAt(i);
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
        int[] points=findTrimPoints(text);
        String userTrim=substringUsingCharAt(text,points[0],points[1]);
        String builtInTrim=text.trim();
        boolean result=compareStrings(userTrim,builtInTrim);
        System.out.println(userTrim);
        System.out.println(builtInTrim);
        System.out.println(result);
    }
}
