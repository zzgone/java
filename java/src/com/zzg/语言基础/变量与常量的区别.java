package com.zzg.语言基础;

public class 变量与常量的区别 {

	/**
	 * 什么是变量 常量，两者的区别
	 * 变量 = 会发生变化的值
	 * 常量 = 不会发生变化的值
	 * */
	
	/**
	 * 如何声明变量与常量
	 * 变量：
	 * 	int i = 1;
	 * 常量：
	 * 	final int i = 1;
	 * 	其中final单词表示，最终的... 表示该变量的值不会发生变化
	 * */
	public static void main(String[] args) {
		
		int i = 100;
		System.out.println("i现在的值是" + i);
		
		i = 998;
		i = 123;
		System.out.println("i最后的值是" + i);
		
		
		
		final int x = 666;
		System.out.println("x = " + x);
		
//		x = 777;
		
		
	}
	
}
