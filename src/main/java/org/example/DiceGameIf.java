package org.example;

import java.util.Scanner;

public class DiceGameIf {

    public static void main (String[] args) {

        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number>6) {
            System.out.println("You Won the Game");
        } else {
            System.out.println("You Loss the Game");
        }
    }
}
