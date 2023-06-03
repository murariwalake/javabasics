package org.example.e9.operators.e4.bitwise;

public class GuessTheOutputBitwiseOperators {
    public static void main(String[] args) {
        int b = 5 << 2;
        System.out.println(b);

        int y = 10 >> 1;
        System.out.println(y);

        int n = -16 >>> 2;
        System.out.println(n);

        int r = 12 & 8;
        System.out.println(r);

        int w = 9 | 6;
        System.out.println(w);

        int e = 17 ^ 3;
        System.out.println(e);

        //express 3 * 16 using right shift operator
        System.out.println("3 * 16 = 3 << 4 = " + (3 << 4));
        //express 20 / 4 using left shift operator
        System.out.println("20 / 4 = 20 >> 2 = " + (20 >> 2));
    }
}
