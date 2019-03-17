package com.maktab.HW4.q3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int price, quantity, coupon;

        //getting inputs from user
        System.out.println("Enter the price of photo book: ");
        Scanner scanner = new Scanner(System.in);
        price = scanner.nextInt();
        System.out.println("Enter the quantity of photo book: ");
        quantity = scanner.nextInt();
        System.out.println("Enter the discount rate: ");
        coupon = scanner.nextInt();

        //testing first overloaded constructor
        System.out.println("First overload method: ");
        System.out.println(Billing.computeBill(price));
        System.out.println("*****");

        //testing second overloaded constructor
        System.out.println("Second overload method: ");
        System.out.println(Billing.computeBill(price, quantity));
        System.out.println("*****");

        //testing third overloaded constructor
        System.out.println("Third overload method: ");
        System.out.println(Billing.computeBill(price, quantity, coupon));
        System.out.println("*****");

    }//end of main method
}//end of Q3 method
