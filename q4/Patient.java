package com.maktab.HW4.q4;


public class Patient {
    int ID, age;
    BloodData bloodData;

    public Patient() {
        this.ID = 0;
        this.age = 0;
        this.bloodData = new BloodData();
    }

    public Patient(int ID, int age, String bloodType, String Rh) {
        this.ID = ID;
        this.age = age;
        this.bloodData = new BloodData(bloodType, Rh);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BloodData getBloodData() {
        return bloodData;
    }

    public void setBloodData(BloodData bloodData) {
        this.bloodData = bloodData;
    }
}
