package com.maktab.HW4.q1;

import java.util.Scanner;

public class Encryption {

    Scanner scanner = new Scanner(System.in);
    private int number;
    private String sentence;

    public void getMessage() {
        System.out.println("Enter your sentence: ");
        sentence = scanner.nextLine();
    }

    public void getCode() {
        System.out.println("Enter your desired number: ");
        number = scanner.nextInt();
    }

    public char encrypt(String a){
        char t = a.charAt(0);
        return t;
    }

    public void encryptAll(String sentence, int number){

        char[] charArray = sentence.toCharArray();
        for (int i = 0; i < sentence.length(); i++){
            int a = charArray[i];
            if(a != 32) {
                a = +this.number;
                charArray[i] = (char) a;
            }
            System.out.println(charArray[i]);
        }

    }


}

