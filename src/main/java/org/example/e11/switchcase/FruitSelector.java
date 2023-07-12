package org.example.e11.switchcase;

import java.util.Scanner;

public class FruitSelector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a fruit:");
        System.out.println("1. Apple");
        System.out.println("2. Banana");
        System.out.println("3. Orange");
        System.out.print("Enter your choice (1-3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected: Apple");
                break;
            case 2:
                System.out.println("You selected: Banana");
                break;
            case 3:
                System.out.println("You selected: Orange");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
