package com.maktab.HW4.q1;

public class Q1 {
    public static void main(String[] args) {
        //making a new Encryption object
        Encryption encryptor = new Encryption();

        //getting message and code from user to do the encryption
        encryptor.encryptAll(encryptor.getMessage(), encryptor.getCode());

    }//end of main method
}//end of Q1 class
