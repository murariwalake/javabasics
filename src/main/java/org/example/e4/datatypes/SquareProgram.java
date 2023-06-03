package org.example.e4.datatypes;

import java.util.Scanner;

public class SquareProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int square = number * number;

        System.out.println("The square of " + number + " is: " + square);
    }
}

