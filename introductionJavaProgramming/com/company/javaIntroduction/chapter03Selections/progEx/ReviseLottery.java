package com.company.javaIntroduction.chapter03Selections.progEx;

import java.util.Scanner;

public class ReviseLottery {
    /* Revise Lottery to generate a lottery of a three-digit number.
    The program prompts the user to enter a three-digit number and determines whether the user wins according to the
    rules:
    1. If the user input matches the lottery number in the exact order, the award is $12,000.
    2. If all digits in the user input match all digits in the lottery number, the award is $5,000.
    3. If one digit in the user input matches a digit in the lottery number, the award is $2,000.
     */
    public static void main(String[] args) {
        // Generate a lottery number
        int lottery = (int)(Math.random() * 1000);

        // Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your lottery pick (three digits): ");
        int guess = input.nextInt();

        // Get digits from lottery
        int lotteryDigit1 = lottery % 100;
        int lotteryDigit2 = lottery % 100 /10;
        int lotteryDigit3 = lottery /100;

        // Get digits from guess
        int guessDigit1 = guess % 100;
        int guessDigit2 = guess % 100 / 10;
        int guessDigit3 = guess / 100;

        System.out.println("The lottery numbers are " + lottery);

        // Check the guess
        if (guess == lottery)
            System.out.println("Exact match: you win $ 12.000");
        else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2 && guessDigit3 == lotteryDigit3)
            System.out.println("Match all digits: you win $ 5.000");
        else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3
                || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3
                || guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3)
            System.out.println("Match one digit: you win $ 2.000");
        else
            System.out.println("Sorry, no match. Better Luck next Time!");
    }
}
