package com.maktab.HW4.q2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        String firstName, lastName;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        firstName = scanner.next();
        System.out.println("Please enter your first name: ");
        lastName = scanner.next();

        FormLetterWriter.displaySalutation(lastName);
        FormLetterWriter.displaySalutation(firstName, lastName);


    }

}
