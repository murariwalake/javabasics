package org.example.e5.unicodes;

public class Unicodes {
    public static void main(String[] args) {
        //print rupees symbol is ('\u20B9' or 8377)
        //char rupeesSymbol = '\u20B9';
        char rupeesSymbol = 8377;
        System.out.println("Rupees symbol = " + rupeesSymbol);

        //print dollar symbol ('\u0024' or 36)
        char dollarSymbol = '\u0024';
        System.out.println("Dollar symbol = " + dollarSymbol);

        //A-Z : 65 - 90
        //a-z : 97 - 122

        char a = 65;
        char aa = 'A';
        System.out.println("a = " + a) ;
        System.out.println("aa = " + aa) ;
        int aaa = 65;
        System.out.println("aaa = \n\n" + (char)aaa);


        printAllUnicodes();
    }

    private static void printAllUnicodes() {
        for(char i = '\u0000'; i < '\uFFFF'; i++) {
            System.out.print(i + " ");
        }
    }
}
