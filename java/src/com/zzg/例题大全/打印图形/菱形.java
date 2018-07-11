package com.zzg.例题大全.打印图形;

public class 菱形 {

	// 打印菱形 ◇
	public static void main(String[] args) {
		int line = 7;
		
		int i, j, k;
		
		//上半部分 打印为金字塔型，等腰三角形
		for (i = 1; i <= line; i++) {// 控制行
			for (j = 1; j <= line - i; j++)// 控制行前面的空格
				System.out.print(" ");
			for (k = 1; k <= 2 * i - 1; k++)// 控制**
				System.out.print("*");
			System.out.println("");// 换行
		}

		//下半部分 倒过来的等腰三角形
		for (i = 1; i <= line - 1; i++) {// 控制行，比上半部分 少中间这一行
			for (j = 1; j <= i; j++)// 控制空格, j <= i, i为1时补1个空格，为2时补2个，以此类推
				System.out.print(" ");
			for (k = 1; k <= (line * 2 - 1) - 2 * i; k++)// (line * 2 - 1) line*2为总行数,-1为要比上部分少1行 
				System.out.print("*");
			System.out.println("");// 换行
		}
		
		
		System.out.println("============================");
		
		
		// 打印空心菱形
		int n = 12;
		int height = n >> 1;
		for (i = -height; i <= height; i++) {
			for (j = n; j >= 0; j--) {
				if((j + i) % n == 0 || (j - i) % n == 0){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
