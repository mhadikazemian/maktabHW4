package com.maktab.HW4.q3;

public class Billing {
    public static double computeBill(int price) {
        return (price * 1.08);
    }

    public static double computeBill(int price, int quantity) {
        return (price * quantity * 1.08);

    }

    public static double computeBill(int price, int quantity, int coupon) {
        return (price * quantity * (1 - 0.01*coupon) * 1.08);

    }
}
