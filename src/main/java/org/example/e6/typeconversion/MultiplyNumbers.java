package org.example.e6.typeconversion;

import java.util.Scanner;

public class MultiplyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int intValue = scanner.nextInt();

        System.out.print("Enter a double number: ");
        double doubleValue = scanner.nextDouble();

        double result = intValue * doubleValue;

        System.out.println("The result of multiplying " + intValue + " and " + doubleValue + " is: " + result);
    }
}

