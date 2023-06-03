package org.example.e9.operators.e2.arithmeticrelational;

public class ArithmeticAndRelationalOperators {
    public static void main(String[] args) {
        //Arithmetic operators
//        int p = 10, q = 3;
//        System.out.println("Addition = " + (p + q));
//        System.out.println("Multiplication = " + p * q);
//        System.out.println("Division = " + p / q);
//        System.out.println("Reminder = " + p % q);

        //Relational operators
        int score = 85;
        int passingThreshold = 35;
        boolean isPassing = score >= passingThreshold;
        System.out.println("Is the student passing? : " + isPassing);

        boolean isFailing = score < passingThreshold;
        System.out.println("Is the student failing? : " + isFailing);

        boolean isOutOfOut = score == 100;
        System.out.println("Is the score out of out ? : " + isOutOfOut);

        boolean isDistinction = score > 70;
        System.out.println("Is this distinction score ? " + isDistinction);

        System.out.println("Is score == 90 ? " + (score == 90) );
    }
}
