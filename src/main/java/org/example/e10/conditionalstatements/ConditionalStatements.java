package org.example.e10.conditionalstatements;

public class ConditionalStatements {
    public static void main(String[] args) {
        //if statement
        int x = 10;
        if (x == 0) {
            System.out.println(x + " is zero");
        }

        //if else statement
        int y = -5;
        if (y == 0) {
            System.out.println(x + " is zero");
        } else {
            System.out.println(y + " is non-zero number");
        }

        //else if ladder
        int z = 25;
        if (z < 0) {
            System.out.println(z + " is negative");
        } else if (z == 0) {
            System.out.println(z + " is zero");
        } else {
            System.out.println(z + " is positive");
        }


    }
}
