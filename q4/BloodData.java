package com.maktab.HW4.q4;

public class BloodData {

    //BloodData class' instances
    private String[] bloodTypes = {"O", "A", "B", "AB"};
    private String bloodType;
    private String RhFactor;

    //first overloaded constructor
    public BloodData() {
        this.bloodType = "O";
        this.RhFactor = "+";
    }

    //second overloaded constructor
    public BloodData(String bloodType, String RhFactor) {
        setBloodType(bloodType);
        setRhFactor(RhFactor);
    }

    /*getters and setters*/
    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        //adding constrains so the user couldn't enter invalid inputs
        int k = 0;
        for (int i = 0; i < 4; i++) {
            if (bloodType.equals(bloodTypes[i])) {
                this.bloodType = bloodType;
                k = 1;
                break;
            }
        }
        if (k == 0)
            System.out.println("invalid blood type!");
    }

    public String getRhFactor() {
        return RhFactor;
    }

    public void setRhFactor(String RhFactor) {
        //adding constrains so the user couldn't enter invalid inputs
        if (RhFactor.equals("+") || RhFactor.equals("-")) {
            this.RhFactor = RhFactor;
        } else
            System.out.println("invalid RhFactor!");
    }
}//end of BloodData class
