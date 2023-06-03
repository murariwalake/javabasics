package org.example.e9.operators.e4.bitwise;

public class BitwiseOperators {
    public static void main(String[] args) {
        //Bitwise AND (&):
        //1 & 1 = 1
        //0 & 1 = 0
        //1 & 0 = 0
        //0 & 0 = 0

        //Bitwise OR (|):
        //  1 | 1 = 1
        //  1 | 0 = 1
        //  0 | 1 = 1
        //  0 | 0 = 0

        //Bitwise XOR (^):
        // 1 ^ 1 = 0
        // 1 ^ 0 = 1
        // 0 ^ 1 = 1
        // 0 ^ 0 = 0


        //Bitwise AND (&):
//        int a = 5;     // Binary: 0101
//        int b = 3;     // Binary: 0011
//        int result = a & b;//     0001
//        System.out.println(result);  // Output: 1 (Binary: 0001)

        //Bitwise OR (|):
//        int a = 5;     // Binary: 0101
//        int b = 3;     // Binary: 0011
//        int result = a | b;//     0111
//        System.out.println(result);  // Output: 7 (Binary: 0111)

        //Bitwise XOR (^):
//        int a = 5;     // Binary: 0101
//        int b = 3;     // Binary: 0011
//        int result = a ^ b;//     0110
//        System.out.println(result);  // Output: 6 (Binary: 0110)

        //Bitwise NOT (~):
//        int a = 5;     //Binary: 00000000000000000000000000000101
//        int result = ~a;//       11111111111111111111111111111010
//        System.out.println(result);  // Output: -6 (Binary: 11111111111111111111111111111010)

        //Left Shift (<<):
//        int a = 5;     // Binary: 00000101 -> 00001010 -> 00010100
//        int result = a << 2; //   00010100
//        System.out.println(result);  // Output: 20 (Binary: 00010100)

        //Right Shift (>>):
//        int a = 12;     // Binary: 00001100 -> 00000110 -> 00000011
//        int result = a >> 2;//     00000011
//        System.out.println(result);  // Output: 3 (Binary: 0000 0011)

        //a * 2ⁿ = a << n
        //5 * 8 = 5 << 3 = 40 (n = 3)
        // 40 / 8 = 40 >> 3 = 5
        //System.out.println("5 << 3 = " + (5 << 3));
        //System.out.println("40 >> 3 = " + (40 >> 3));

        //Unsigned Right Shift (>>>):
        int a = -12;     // Binary: 1111 1111 1111 1111 1111 1111 1111 0100
        int result = a >>> 2;
        System.out.println(result);  // Output: 1073741821 (Binary: 0011 1111 1111 1111 1111 1111 1111 1101)
    }
}
