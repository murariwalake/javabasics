package org.example.e14.continueandbreak;

public class BreakAndContinue {

    public static void main(String[] args) {
        //break and continue
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}
