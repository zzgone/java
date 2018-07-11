package com.zzg.例题大全.打印图形;

public class 伞形 {

	public static void main(String[] args) {
		int height2 = 9;
		int h2 = 0;
		int h3 = 0;
		if (height2 % 2 == 0) {
			height2 = height2 / 2;
			h2 = height2;
			h3 = h2 - 1;
		} else {
			height2 = height2 / 2;
			h2 = height2 + 1;
			h3 = h2 - 2;
		}
		for (int i = 1; i <= height2; i++) {
			for (int j = 1; j <= height2 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int j = 1; j <= h2; j++) {
			for (int k = 1; k <= h3; k++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
	}
}
