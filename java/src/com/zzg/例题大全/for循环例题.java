package com.zzg.例题大全;

public class for循环例题 {

	
	public static void main(String[] args) {
		diedaishuzu();
	}
	
	/**
	 * 使用for循环，嵌套
	 * 打印九九乘法表
	 * 
	 * \t 制表符
	 * */
	public static void jiujiuchengfa() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j<= i; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();
		}
	}
	
	/**
	 * 使用for循环 遍历(迭代) 一个数组的数据
	 * */
	public static void diedaishuzu() {
		
		int[] array = new int[3];
		array[0] = 80;
		array[1] = 60;
		array[2] = 77;
		
//		System.out.println(array[0]);
//		System.out.println(array[0]);
//		System.out.println(array[0]);
		
		// length = 长度的意思
		System.out.println(array.length);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}
}
