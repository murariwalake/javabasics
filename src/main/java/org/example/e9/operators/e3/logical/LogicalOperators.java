package org.example.e9.operators.e3.logical;

public class LogicalOperators {
    public static void main(String[] args) {

//        System.out.println("true && true = " + (true && true) );
//        System.out.println("true && false = " + (true && false) );
//        System.out.println("false && true = " + (false && true) );
//        System.out.println("false && false = " + (false && false) );
//
//        System.out.println("\ntrue || true = " + (true || true) );
//        System.out.println("true || false = " + (true || false) );
//        System.out.println("false || true = " + (false || true) );
//        System.out.println("false || false = " + (false || false) );
//
//        System.out.println("!true = " + !true);


//        boolean hasDegree = true;
//        boolean hasExperience = false;
//        boolean isEligible = hasDegree && hasExperience;
//        System.out.println("Is the candidate eligible for the job? : " + isEligible);

//        boolean isLoyalCustomer = true;
//        double purchaseAmount = 50.00;
//        boolean qualifiesForDiscount = isLoyalCustomer || purchaseAmount > 100;
//        System.out.println("Does the customer qualify for a discount? : " + qualifiesForDiscount);
//
//        boolean isLightOn = false;
//        System.out.println("Is the light on? " + isLightOn);
//        // Use the logical NOT operator to toggle the light status
//        isLightOn = !isLightOn;
//        System.out.println("Is the light on? " + isLightOn);
//
        //&& || are short circuit operators
        boolean answer1 = (10 > 5) || ( 10 / 0 == 0);
        System.out.println("answer1 = " + answer1);

        boolean answer2 = (10 < 5) && ( 10 / 0 == 0);
        System.out.println("answer2 = " + answer2);


    }
}
