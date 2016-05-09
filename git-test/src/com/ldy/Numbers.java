package com.ldy;

/**
 *  Sum valuse
 */
public class Numbers {

    int number[] = { 0, 5, 9 };

    public void showNumbers() {
        System.out.println("Data:");
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            System.out.println("values: " + number[i]);
            sum += number[i];
        }
        System.out.println(sum);
    }
}
