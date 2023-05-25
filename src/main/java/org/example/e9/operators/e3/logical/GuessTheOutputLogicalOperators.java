package org.example.e9.operators.e3.logical;

public class GuessTheOutputLogicalOperators {
    public static void main(String[] args) {

        boolean result1 = true && false;
        System.out.println(result1);

        boolean result2 = (5 > 3) && (10 < 15);
        System.out.println(result2);

        boolean result3 = (7 > 5) || (3 > 10);
        System.out.println(result3);

        boolean result4 = !true;
        System.out.println(result4);

        boolean result5 = !(12 < 10 && 8 > 15);
        System.out.println(result5);

    }
}
