package com.gla.string.level2;

import java.util.Scanner;
public class StudentGrade{
    static int[][] generateScores(int n){
        int[][] scores=new int[n][3];
        for(int i=0;i<n;i++){
            scores[i][0]=(int)(Math.random()*90)+10;
            scores[i][1]=(int)(Math.random()*90)+10;
            scores[i][2]=(int)(Math.random()*90)+10;
        }
        return scores;
    }
    static double[][] calculateResults(int[][] scores){
        int n=scores.length;
        double[][] result=new double[n][4];
        for(int i=0;i<n;i++){
            double total=scores[i][0]+scores[i][1]+scores[i][2];
            double avg=total/3;
            double percent=(total/300)*100;
            result[i][0]=Math.round(total*100.0)/100.0;
            result[i][1]=Math.round(avg*100.0)/100.0;
            result[i][2]=Math.round(percent*100.0)/100.0;
        }
        return result;
    }
    static String[][] calculateGrade(double[][] result){
        int n=result.length;
        String[][] grade=new String[n][1];
        for(int i=0;i<n;i++){
            double p=result[i][2];
            if(p>=80) grade[i][0]="A";
            else if(p>=70) grade[i][0]="B";
            else if(p>=60) grade[i][0]="C";
            else if(p>=50) grade[i][0]="D";
            else if(p>=40) grade[i][0]="E";
            else grade[i][0]="R";
        }
        return grade;
    }
    static void displayScorecard(int[][] scores,double[][] result,String[][] grade){
        System.out.println("Phy\tChem\tMath\tTotal\tAverage\tPercent\tGrade");
        for(int i=0;i<scores.length;i++){
            System.out.println(
                    scores[i][0]+"\t"+
                            scores[i][1]+"\t"+
                            scores[i][2]+"\t"+
                            result[i][0]+"\t"+
                            result[i][1]+"\t"+
                            result[i][2]+"\t"+
                            grade[i][0]
            );
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] scores=generateScores(n);
        double[][] result=calculateResults(scores);
        String[][] grade=calculateGrade(result);
        displayScorecard(scores,result,grade);
    }
}
