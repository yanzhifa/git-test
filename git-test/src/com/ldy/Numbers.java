package com.ldy;

public class Numbers {

    int number[] = { -1, 0, 5, 9, 20 };

    public void showNumbers() {
        System.out.println("Data:");
        for (int i : number) {
            System.out.println("values: " + number[i]);
        }
    }
}
