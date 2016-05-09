package com.ldy;

public class Numbers {

    int number[] = { 0, 5, 9 };

    public void showNumbers() {
        System.out.println("Data:");
        for (int i = 0; i < number.length; i++) {
            System.out.println("values: " + number[i]);
        }
    }
}
