package org.example.e9.operators.e1.unerybinaryternary;

public class GuessTheOutputUnaryBinaryAndTernary {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++);
        System.out.println(++a);

        int c = 10;
        int d = 4;
        System.out.println(c % d);

        int e = 10;
        int f = 4;
        int ans = e > f ? e : f;
        System.out.println(ans);
    }
}
