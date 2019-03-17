package com.maktab.HW4.q1;

import java.util.Scanner;

public class Encryption {

    Scanner scanner = new Scanner(System.in);
    private int number;
    private String sentence;

    //gets the sentence from user
    public String getMessage() {
        System.out.println("Enter your sentence: ");
        sentence = scanner.nextLine();
        return sentence;
    }

    //gets the encryption code from user
    public int getCode() {
        System.out.println("Enter your desired number: ");
        number = scanner.nextInt();
        return number;
    }

    //takes in a single letter and return a result of type char
    public char encrypt(String a) {
        char t = a.charAt(0);
        return t;
    }

    //does the encryption
    public void encryptAll(String sentence, int number) {

        char[] charArray = sentence.toCharArray();
        for (int i = 0; i < sentence.length(); i++) {
            int a = charArray[i];
            if (a != 32) {
                a += number;
                charArray[i] = (char) a;
            }
            System.out.print(charArray[i]);
        }

    }//end of encryptAll method


}//end of class

