package com.zzg.语言基础;

import java.util.Scanner;

public class 运算符例题 {
	
	public static void main(String[] args) {
		test4();
	}

	/**
	 * 判断数字的奇偶性
	 * 奇数 单数 不被2整除
	 * 偶数 双数 被2整数
	 * */
	public static void test1() {
		Scanner s = new Scanner(System.in);// 一个输入对象
		System.out.println("请输入一个整数");
		long n = s.nextLong();// 输入的数字
		
		System.out.println(n % 2 == 0 ? "偶数" : "奇数");
	}
	
	/**
	 * 计算闰年，平年
	 * */
	public static void test3() {
		Scanner s = new Scanner(System.in);// 一个输入对象
		System.out.println("请输入一个年份");
		long year = s.nextLong();// 输入的数字

		boolean b = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		System.out.println(year + "是" + b);
	}
	
	/**
	 * 计算闰年，平年
	 * */
	public static void test4() {
		Scanner s = new Scanner(System.in);// 一个输入对象
		System.out.println("请输入球形的半径");
		double r = s.nextDouble();// 输入的数字
		
		final double PI = 3.1415926;
		double v = 4.0 / 3.0 * PI * r * r * r;
		System.out.println("面积是" + v);
	}
	
}
