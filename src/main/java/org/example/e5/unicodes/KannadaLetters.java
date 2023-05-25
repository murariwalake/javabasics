package org.example.e5.unicodes;

public class KannadaLetters {
    public static void main(String[] args) {
        for(char kannada = '\u0C80'; kannada < '\u0CFF'; kannada++) {
            System.out.print(kannada + " ");
        }
    }
}
