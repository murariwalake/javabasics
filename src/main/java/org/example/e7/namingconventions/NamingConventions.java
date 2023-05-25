package org.example.e7.namingconventions;

public class NamingConventions {
    static final int MY_CONSTANT = 10;
    public static void main(String[] args) {
        int numberOne = 10;
        int numberTwo = 20;
        int sum = sumOfTwoNumbers(numberOne, numberTwo);
        System.out.println("sum = " + sum);
    }

    private static int sumOfTwoNumbers(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }
}
