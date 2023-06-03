package org.example.e9.operators.e1.unarybinaryternary;

public class UnaryBinaryTernary {
    public static void main(String[] args) {
        //Unary operators
        int likes = 100;
        System.out.println("Initial Likes: " + likes);
        // Increment the likes by 1 using ++
        likes++;
        System.out.println("Likes after increment: " + likes);
        // Decrement the likes by 1 using --
        likes--;
        System.out.println("Likes after decrement: " + likes);

        boolean isLoggedIn = false;
        System.out.println("\nUser Logged In: " + isLoggedIn);
        // Use the "not" operator to toggle the login status
        isLoggedIn = !isLoggedIn;
        System.out.println("User Logged In (after toggle): " + isLoggedIn);

        //Binary operators
        int p = 10, q = 3;
        System.out.println("\nAddition = " + (p + q));
        System.out.println("Multiplication = " + p * q);
        System.out.println("Division = " + p / q);
        System.out.println("Reminder = " + p % q);

        //Ternary operators
        int age = 25;
        String result = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
        System.out.println(result);

        int number = 7;
        String parity = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("\n" + number + " is " + parity);
    }
}
