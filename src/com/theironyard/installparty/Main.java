package com.theironyard.installparty;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double ranNum = Math.floor(Math.random() * 100);
        System.out.println(ranNum);

        System.out.println("Guess a number between 1 and 100!");
        Scanner scanner = new Scanner(System.in);
        int howManyGuesses = 100;
        int guessesMade = 0;
        double userGuess = -1;
        boolean winner = false;

        if (winner == false) {

            while (guessesMade != howManyGuesses) {
                userGuess = scanner.nextInt();
                guessesMade++;
                if (ranNum == userGuess) {
                    System.out.println(userGuess + " is correct!");
                    howManyGuesses = guessesMade;

                } else if (ranNum < userGuess) {
                    System.out.println(userGuess + " is too high!");
                } else if (ranNum > userGuess) {
                    System.out.println(userGuess + " is too low!");
                }
            }
        }
            System.out.println("you took " + guessesMade + " guesses to win");

    }
}
