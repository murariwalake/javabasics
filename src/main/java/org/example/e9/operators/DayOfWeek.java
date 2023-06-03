package org.example.e9.operators;

public class DayOfWeek {
    public static void main(String[] args) {
        int currentDay = 0; // Sunday is represented as 0
        int daysToAdd = 53;
        int futureDay = (currentDay + daysToAdd) % 7;

        System.out.println("The day of the week after 53 days will be: " + futureDay);
    }
}

