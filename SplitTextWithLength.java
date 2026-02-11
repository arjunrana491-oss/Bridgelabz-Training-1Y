package com.gla.string.level2;

import java.util.Scanner;
public class SplitTextWithLength{
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
    static String[][] create2DArray(String[] words){
        String[][] result=new String[words.length][2];
        for(int i=0;i<words.length;i++){
            result[i][0]=words[i];
            result[i][1]=String.valueOf(findLength(words[i]));
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        String[] words=splitUsingCharAt(text);
        String[][] data=create2DArray(words);
        System.out.println("Word\tLength");
        for(int i=0;i<data.length;i++){
            int len=Integer.parseInt(data[i][1]);
            System.out.println(data[i][0]+"\t"+len);
        }
    }
}

