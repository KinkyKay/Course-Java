package com.company.javaIntroduction.chapter04MathematicalFunctionsCharactersAndStrings.progEx;

import java.util.Random;

public class RandomCharacter {
    /*  Write a program that displays a random lowercase letter using the Math.random() method. */
    public static void main(String[] args) {
        Random rnd = new Random();
        char c = (char) ('a'+ rnd.nextInt(26));
        System.out.println(c);
    }
}

