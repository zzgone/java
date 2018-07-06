package com.zzg;

public class 数组 {

	
	/**
	 * int fenshu[] = new int[3];
	 * 解读：
	 * int fenshu[] 数组类型 和 数组变量名
	 * new int[3] 创建一个数组 int型的，大小是3
	 * */
	public static void main(String[] args) {
		// 创建数组 大小为3
		int fenshu[] = new int[3];
		
		// 填值 （下标 与 值）
		fenshu[0] = 80;// 语文
		fenshu[1] = 60;// 数学
		fenshu[2] = 77;// 英语
		
		System.out.println(fenshu[2]);
		
		
		
		/**
		 * 以下是数组的多种创建方式
		 * */
		int a[] = new int[1];
		int[] b = new int[1];
		
		int c[] = new int[]{80,60,77};
	
		System.out.println(c[2]);
		
		
		/**
		 * 二维数组
		 * */
		int x[][] = new int[3][4];
		
		x[0][3] = 66;
		
		System.out.println(x[0][3]);
		System.out.println(x[2][3]);
		System.out.println(x[2]);// 打印的是 内存地址
	}
}
