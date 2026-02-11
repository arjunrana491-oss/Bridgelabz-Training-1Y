package com.gla.string.level2;

import java.util.Scanner;
public class SplitText{
    static int findLength(String text){
        int count=0;
        try{
            while(true){
                text.charAt(count);
                count++;
            }
        }catch(RuntimeException e){
            return count;
        }
    }
    static String[] splitUsingCharAt(String text){
        int len=findLength(text);
        int wordCount=1;
        for(int i=0;i<len;i++){
            if(text.charAt(i)==' '){
                wordCount++;
            }
        }
        int[] spaces=new int[wordCount+1];
        int idx=1;
        spaces[0]=-1;
        for(int i=0;i<len;i++){
            if(text.charAt(i)==' '){
                spaces[idx++]=i;
            }
        }
        spaces[idx]=len;
        String[] words=new String[wordCount];
        for(int i=0;i<wordCount;i++){
            String temp="";
            for(int j=spaces[i]+1;j<spaces[i+1];j++){
                temp+=text.charAt(j);
            }
            words[i]=temp;
        }
        return words;
    }
    static boolean compareArrays(String[] a,String[] b){
        if(a.length!=b.length){
            return false;
        }
        for(int i=0;i<a.length;i++){
            if(!a[i].equals(b[i])){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        String[] userSplit=splitUsingCharAt(text);
        String[] builtInSplit=text.split(" ");
        boolean result=compareArrays(userSplit,builtInSplit);
        System.out.println(result);
    }
}

