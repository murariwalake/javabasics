package org.example.e6.typeconversion;

public class TypeConversion {

    public static void main(String[] args) {
        //convert char to int
        char a = 'a';
        int aa = a;
        System.out.println("a = " + a + "\naa = " + aa );

        //int to long
        int b = 100;
        long bb = b;
        System.out.println("b = " + b + "\nbb = " + bb);

        //int to double
        int c = 200;
        double cc = c;
        System.out.println("c = " + c + "\ncc = " + cc );

        //int to char
        int d = 65;
        char dd = (char)d;
        System.out.println("d = " + d + "\ndd = " + dd);

        //long to int
        long e = 5000;
        int ee = (int)e;
        System.out.println("e = " + e + "\nee = " + ee);

        //double to int
        double f = 6000;
        int ff = (int)f;
        System.out.println("f = " + f + "\nff = " + ff);

        double x = 10;
        float y = 10.05f;
        double result = x + y;
        System.out.println("result = " + result);
    }
}
