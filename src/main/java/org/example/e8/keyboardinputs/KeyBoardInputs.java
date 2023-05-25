package org.example.e8.keyboardinputs;

import java.util.Scanner;

public class KeyBoardInputs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter 2 integer value");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Sum of above two numbers is " + (a + b));

        in.nextLine();

        System.out.println("\n\nEnter two floating values");
        float c = in.nextFloat();
        float d = in.nextFloat();
        System.out.println("Sum of above two numbers is " + (c + d));

        in.nextLine();

        //in.nextLong();
        //in.nextDouble();

        System.out.println("\n\nEnter boolean value true or false");
        boolean e = in.nextBoolean();
        System.out.println("Entered boolean values is " + e);

        in.nextLine();

        //How to read a line from input
        System.out.println("\n\nEnter a line");
        String line = in.nextLine();
        System.out.println("Entered line is : " + line);

        in.nextLine();

        //How to read a word from input
        System.out.println("\n\nEnter a line again");
        String word = in.next();
        System.out.println("First word of entered line is " + word);

        in.nextLine();

        //How to read first character of a word
        System.out.println("\n\nEnter a word/line");
        char x = in.next().charAt(0);
        System.out.println("first character of entered word/line is " + x);

    }
}
