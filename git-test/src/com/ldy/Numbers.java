package com.ldy;

/**
 * Sum valuse
 */
public class Numbers {

    int number[] = { -1, 0, 5, 9, 20, 45, 100 };

	public void showNumbers() {
		System.out.println("Data:");
		for (int i : number) {
			System.out.println("values: " + number[i]);
		}
	}
	public void sumNumber() {
		int sum = 0;
		for (int i : number) {
			System.out.println("values: " + number[i]);
			sum += number[i];
		}
		System.out.println(sum);
	}
}
