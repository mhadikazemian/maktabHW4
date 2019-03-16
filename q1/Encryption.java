package com.maktab.HW4.q1;

import java.util.Scanner;

public class Encryption {

    Scanner scanner = new Scanner(System.in);
    private int number;
    private String sentence;

    public String getMessage() {
        System.out.println("Enter your sentence: ");
        sentence = scanner.nextLine();
        return sentence;
    }

    public int getCode() {
        System.out.println("Enter your desired number: ");
        number = scanner.nextInt();
        return number;
    }

    public char encrypt(String a) {
        char t = a.charAt(0);
        return t;
    }

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

    }


}

