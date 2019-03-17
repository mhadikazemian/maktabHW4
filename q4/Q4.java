package com.maktab.HW4.q4;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("First BloodData constructor: ");
        BloodData bloodData1 = new BloodData();
        System.out.println("Blood Type: " + bloodData1.getBloodType() + " Rh Factor: " + bloodData1.getRhFactor());
        System.out.println("*************");
        System.out.println("Second BloodData constructor: ");
        BloodData bloodData2 = new BloodData("AB", "+");
        System.out.println(" Blood Type: " + bloodData2.getBloodType() + " Rh Factor: " + bloodData2.getRhFactor());
        System.out.println("*************");
        System.out.println("First Patient constructor: ");
        Patient patient1 = new Patient();
        System.out.println("Age: " + patient1.getAge() + " ID: " + patient1.getID());
        System.out.println("Blood Type: " + patient1.bloodData.getBloodType());
        System.out.println("Rh Factor: " + patient1.bloodData.getRhFactor());
        System.out.println("*************");
        System.out.println("Second Patient constructor: ");
        Patient patient2 = new Patient(1, 25, "A", "+");
        System.out.println("Age: " + patient2.getAge() + " ID: " + patient2.getID());
        System.out.println("Blood Type: " + patient2.bloodData.getBloodType());
        System.out.println("Rh Factor: " + patient2.bloodData.getRhFactor());
        System.out.println("*************");


    }
}
