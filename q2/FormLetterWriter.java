package com.maktab.HW4.q2;

public class FormLetterWriter {

    public void displaySalutation(String lastName){
        System.out.println("Dear Mr. or Ms" + lastName);
        System.out.println("Thank you for your recent order");
    }
    public void displaySalutation(String firstName, String lastName){
        System.out.println("Dear " + firstName + " " + lastName);
        System.out.println("Thank you for your recent order");

    }
}
