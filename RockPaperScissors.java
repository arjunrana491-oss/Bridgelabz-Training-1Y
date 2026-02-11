package com.gla.string.level2;

import java.util.Scanner;
public class RockPaperScissors{
    static String getComputerChoice(){
        int r=(int)(Math.random()*3);
        if(r==0) return "rock";
        if(r==1) return "paper";
        return "scissors";
    }
    static String findWinner(String user,String comp){
        if(user.equals(comp)) return "Draw";
        if(user.equals("rock") && comp.equals("scissors")) return "User";
        if(user.equals("paper") && comp.equals("rock")) return "User";
        if(user.equals("scissors") && comp.equals("paper")) return "User";
        return "Computer";
    }
    static String[][] calculateStats(int userWins,int compWins,int games){
        String[][] data=new String[2][3];
        double userPercent=(userWins*100.0)/games;
        double compPercent=(compWins*100.0)/games;
        data[0][0]="User";
        data[0][1]=String.valueOf(userWins);
        data[0][2]=String.valueOf(userPercent);
        data[1][0]="Computer";
        data[1][1]=String.valueOf(compWins);
        data[1][2]=String.valueOf(compPercent);
        return data;
    }
    static void displayResults(String[][] games,String[][] stats){
        System.out.println("Game\tUser\tComputer\tWinner");
        for(int i=0;i<games.length;i++){
            System.out.println((i+1)+"\t"+games[i][0]+"\t"+games[i][1]+"\t\t"+games[i][2]);
        }
        System.out.println();
        System.out.println("Player\tWins\tWinPercentage");
        for(int i=0;i<stats.length;i++){
            System.out.println(stats[i][0]+"\t"+stats[i][1]+"\t"+stats[i][2]);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[][] games=new String[n][3];
        int userWins=0;
        int compWins=0;
        for(int i=0;i<n;i++){
            String user=sc.next().toLowerCase();
            String comp=getComputerChoice();
            String winner=findWinner(user,comp);
            games[i][0]=user;
            games[i][1]=comp;
            games[i][2]=winner;
            if(winner.equals("User")) userWins++;
            if(winner.equals("Computer")) compWins++;
        }
        String[][] stats=calculateStats(userWins,compWins,n);
        displayResults(games,stats);
    }
}
