package com.maktab.HW4.q2;

public class FormLetterWriter {

    //First overloaded method
    public static void displaySalutation(String lastName) {
        System.out.println("Dear Mr. or Ms " + lastName);
        System.out.println("Thank you for your recent order");
        System.out.println("*******************");
    }

    //Second overload method
    public static void displaySalutation(String firstName, String lastName) {
        System.out.println("Dear " + firstName + " " + lastName);
        System.out.println("Thank you for your recent order");

    }
}//end of FormLetterWriter class
