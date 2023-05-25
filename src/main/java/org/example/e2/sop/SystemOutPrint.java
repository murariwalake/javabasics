package org.example.e2.sop;

public class SystemOutPrint {
    public static void main(String[] args) {
        System.out.println("Hello World");

        System.out.print("Hi, ");
        System.out.print("Hello\n");

        System.out.println( 5 + 6 + " Hello World"); // 11 Hello World
        System.out.println("Hello World " + 5 + 6); // Hello World 56
        System.out.println("Hello World " + (5 + 6)); //Hello World 11
        System.out.println("Hello World " + 5 * 6); //Hello World 30
    }
}
