package com.zzg.语言基础;

public class 运算符 {

	public static void main(String[] args) {
		test6();
	}
	
	/**
	 * 算数运算符
	 * */
	public static void test() {
		// 加 +
		System.out.println(1 + 1);
		
		// 减 -
		System.out.println(1 - 1);
		
		// 乘 *
		System.out.println(10 * 30);
		
		// 除 /
		System.out.println(30 / 10);
		
		// 取余 %
		System.out.println(10 % 30);
	}
	
	/**
	 * 自增、自减运算符
	 *
	 * */
	public static void test2() {
		// 自增运算符
		int i = 1;
		i = i + 1;// 传统自增写法
		i++;// 运算符写法
		
		// 自减运算符
		int x = 1;
		x = x - 1;
		x--;
	}
	
	
	/**
	 * 比较运算符
	 * */
	public static void test3() {
		// 大于
		System.out.println(1 > 2);
		
		// 小于
		System.out.println(1 < 2);
		
		// 等于
		System.out.println(1 == 1);
		
		// 不等于
		System.out.println(1 != 1);
		
		// 大于或者等于
		System.out.println(2 >= 2);
		
		// 小于或者等于
		System.out.println(1 <= 1);
		
	}
	
	/**
	 * 逻辑运算符
	 * && 并且、什么和什么
	 * */
	public static void test4() {
		// 并且 && 逻辑与  --> 多个条件的时候， 只要有其中之一不成立，则整个公式都不成立
		System.out.println(1 == 1 && 2 == 2);
		System.out.println(1 == 1 && 2 == 1);
		System.out.println(1 == 1 && 2 == 2 && 3 == 6);
		
		// 或者 || 逻辑或 --> 多个条件时，只要有其中之一成立，则整个公式都成立
		System.out.println(1 == 1 || 1 == 2);
		System.out.println(1 == 1 || 2 == 2 || 3 == 9);
		
		// ! 非 逻辑非
		System.out.println(1 != 1);
		System.out.println(1 != 2);
	}
	
	/**
	 * 三元运算符
	 * 1 == 2 ? 0 : 1;
	 * 
	 * 1 等于 2 吗？ 如果等于则是0，如果不等于则是1。
	 * 条件成立吗？如果成立：不成立
	 * */
	public static void test5() {
		 System.out.println(1 == 1 ? "成立" : "不成立");
	}
	
	/**
	 * 特殊优先运算符
	 * */
	public static void test6() {
		System.out.println(1 + 2 * 3);// 7 乘除法比加减法优先算
		System.out.println((1 + 2) * 3);// 9 括号优先算
		
		System.out.println((1 == 1 || 1 == 2) && 2 == 3);
	}
}
