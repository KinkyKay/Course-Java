package com.company.javaIntroduction.chapter03Selections.progEx;

import java.util.Scanner;

public class SimpleIfDemo {
    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);
        // Ask for input
        System.out.println("Enter an integer: ");
        // Enter input
        int number = input.nextInt();

        // check 5
        if (number % 5 == 0) {
            System.out.println("HiFive");
        }

        // check even
        if (number % 2 == 0) {
            System.out.println("HiEven");
        }
    }
}
