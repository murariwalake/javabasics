package org.example.e12.randomnumbers;

public class RandomNumberGenerator {
    public static void main(String[] args) {

        //Math.random() Generates a random double between [0.0, 1.0)
        System.out.println("Random number 1: " + Math.random());
        System.out.println("Random number 2: " + Math.random());
        System.out.println("Random number 3: " + Math.random());
        System.out.println("Random number 4: " + Math.random());

        //How to generate random number between [0, 50)
        //Math.random() * 50
        System.out.println((int)(Math.random() * 50));

        //How to generate random number between [100, 150)
        //150 - 100 = 50
        //generate random number between [0, 50) and add 100 to it.
        //Math.random() * 50 + 100
        System.out.println((int)(Math.random() * 50 + 100));
    }
}

