package org.example.e9.operators;

public class OperatorsPrecedence {
    public static void main(String[] args) {
        int resultOne = 1 + 2 * 4 + 5 - 2 + 1 % 2 / 2; //12
        System.out.println("resultOne = " + resultOne);

        boolean resultTwo = 1 < 3 == 4 + 5 <= 6 != 3 < 5 + 1; //true
        System.out.println("resultTwo = " + resultTwo);

        boolean resultThree = 4 + 5 < 6 + 6 && 3 + 1 < 4 || 5 + 1 == 4 + 2; //true
        System.out.println("resultThree = " + resultThree);

        int testVar = 0, num = 5;
        boolean resultFour = testVar != 0 && num / testVar > 10; //short circuit operator
        //false && num / testVar > 10
        System.out.println("resultFour = " + resultFour);
    }
}
