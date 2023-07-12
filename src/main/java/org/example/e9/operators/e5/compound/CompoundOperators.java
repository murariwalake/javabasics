package org.example.e9.operators.e5.compound;

public class CompoundOperators {
    public static void main(String[] args) {
//        int a = 10;
//        a += 10; // a = a + 10
//        System.out.println("a = " + a);
//
//        int flags = 8; // 100 in binary
//        flags >>= 1; // flag = 8 >> 1 = 4
//        System.out.println("After right shift: " + flags); // Output: 4

        System.out.println("Prefix increment");
        int x = 5;
        int y = ++x;
        System.out.println("x: " + x); // Output: 6
        System.out.println("y: " + y); // Output: 6

        System.out.println("Postfix increment");
        int p = 5;
        int q = p++;
        System.out.println("p: " + p); // Output: 6
        System.out.println("q: " + q); // Output: 5


    }
}
