package com.zzg.例题大全.打印图形;

public class 钝角三角形 {

	public static void main(String[] args) {
		int height = 9;
		
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
