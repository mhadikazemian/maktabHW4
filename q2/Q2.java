package com.maktab.HW4.q2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        String firstName, lastName;
        Scanner scanner = new Scanner(System.in);

        //getting first name and last name from user
        System.out.println("Please enter your first name: ");
        firstName = scanner.next();
        System.out.println("Please enter your last name: ");
        lastName = scanner.next();

        //testing two overloaded methods of FormLetterWriter class
        FormLetterWriter.displaySalutation(lastName);
        FormLetterWriter.displaySalutation(firstName, lastName);


    }//end of main method

}//end of Q2 class
