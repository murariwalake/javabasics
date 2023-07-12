package org.example.e13.loops.e2.whileanddowhile;

public class WhileAndDoWhile {
    public static void main(String[] args) {
//        int a = 1;
//        while (a <= 5) {
//            System.out.println(a);
//            a++;
//        }
        int b = 1;
        do {
            System.out.println(b);
            b++;
        } while (b <= 5);

        while (3 > 2) {
            System.out.println("infinite loop");
        }
    }
}
