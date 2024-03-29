package com.company.javaIntroduction.chapter04MathematicalFunctionsCharactersAndStrings.progEx;

import java.util.Scanner;

public class GuessBirthdayRefactor {
    /*  Rewrite GuessBirthday.java, to prompt the user to enter the character Y for Yes and N for No, rather than
        entering 1 for Yes and 0 for No.
     */
    public static void main(String[] args) {
        String set1 = "  1  3  5  7\n" +
                "  9 11 13 15\n" +
                " 17 19 21 23\n" +
                " 25 27 29 31";
        String set2 = "  2  3  6  7\n" +
                " 10 11 14 15\n" +
                " 18 19 22 23\n" +
                " 26 27 30 31";
        String set3 = "  4  5  6  7\n" +
                " 12 13 14 15\n" +
                " 20 21 22 23\n" +
                " 28 29 30 31";
        String set4 = "  8  9 10 11\n" +
                " 12 13 14 15\n" +
                " 24 25 26 27\n" +
                " 28 29 30 31";
        String set5 = " 16 17 18 19\n" +
                " 20 21 22 23\n" +
                " 24 25 26 27\n" +
                " 28 29 30 31";

        // day to be determined
        int day = 0;

        // create scanner
        Scanner input = new Scanner(System.in);

        // prompt the user to answer questions
        System.out.println("Is your birthday in Set1?\n");
        System.out.println(set1);
        System.out.println("\nEnter N for No and Y for Yes: ");
        String answer = input.next();

        // in Set1?
        if (answer.equals("Y"))
            day += 1;

        // prompt the user to answer questions
        System.out.println("Is your birthday in Set2?\n");
        System.out.println(set2);
        System.out.println("\nEnter N for No and Y for Yes: ");
        answer = input.next();

        // in set2?
        if (answer.equals("Y"))
            day += 2;

        // prompt the user to answer questions
        System.out.println("Is your birthday in Set3?\n");
        System.out.println(set3);
        System.out.println("\nEnter N for No and Y for Yes: ");
        answer = input.next();

        // in set3?
        if(answer.equals("Y"))
            day += 4;

        // prompt the user to answer questions
        System.out.println("Is your birthday in Set4?\n");
        System.out.println(set4);
        System.out.println("\nEnter N for No and Y for Yes: ");
        answer = input.next();

        // in set4?
        if(answer.equals("Y"))
            day += 8;

        // prompt the user to answer questions
        System.out.println("Is your birthday in Set5?\n");
        System.out.println(set5);
        System.out.println("\nEnter N for No and Y for Yes: ");
        answer = input.next();

        // in set5?
        if(answer.equals("Y"))
            day += 16;

        System.out.println("\nYour birthday is " + day + " !");
    }
}

