package com.gla.string.level3;

import java.util.Scanner;

public class DeckOfCards {

    // Initialize deck
    static String[] initializeDeck(String[] suits, String[] ranks) {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        int index = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index++] = ranks[j] + " of " + suits[i];
            }
        }
        return deck;
    }

    // Shuffle deck
    static String[] shuffleDeck(String[] deck) {
        int n = deck.length;

        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int)(Math.random() * (n - i));

            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    // Distribute cards
    static String[][] distributeCards(String[] deck, int players, int cards) {
        if (players * cards > deck.length) {
            return null;
        }

        String[][] result = new String[players][cards];
        int index = 0;

        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cards; j++) {
                result[i][j] = deck[index++];
            }
        }
        return result;
    }

    // Print players and cards
    static void printPlayers(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println("  " + players[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {
                "2","3","4","5","6","7","8","9","10",
                "Jack","Queen","King","Ace"
        };

        int players = sc.nextInt();
        int cards = sc.nextInt();

        String[] deck = initializeDeck(suits, ranks);
        deck = shuffleDeck(deck);

        String[][] distributed = distributeCards(deck, players, cards);

        if (distributed == null) {
            System.out.println("Cannot distribute cards");
        } else {
            printPlayers(distributed);
        }
    }
}
