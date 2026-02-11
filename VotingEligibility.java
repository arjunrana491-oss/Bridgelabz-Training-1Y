package com.gla.string.level2;

import java.util.Scanner;
import java.util.Random;
public class VotingEligibility{
    static int[] generateAges(int n){
        int[] ages=new int[n];
        Random r=new Random();
        for(int i=0;i<n;i++){
            ages[i]=r.nextInt(90);
        }
        return ages;
    }
    static String[][] checkVotingEligibility(int[] ages){
        String[][] data=new String[ages.length][2];
        for(int i=0;i<ages.length;i++){
            data[i][0]=String.valueOf(ages[i]);
            if(ages[i]<0){
                data[i][1]="false";
            }else if(ages[i]>=18){
                data[i][1]="true";
            }else{
                data[i][1]="false";
            }
        }
        return data;
    }
    static void displayTable(String[][] data){
        System.out.println("Age\tCanVote");
        for(int i=0;i<data.length;i++){
            System.out.println(data[i][0]+"\t"+data[i][1]);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=10;
        int[] ages=generateAges(n);
        String[][] result=checkVotingEligibility(ages);
        displayTable(result);
    }
}
