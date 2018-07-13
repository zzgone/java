package com.zzg.包装类型;

public class UseTest {

	/**
	 * 包装类型有8个，对应8个基本类型
	 * jdk会自动装拆包
	 * 而不需要使用
	 * Integer i = new Integer(1);来声明一个integer变量
	 * 只需要
	 * Integer i = 1;即可
	 * */
	public static void main(String[] args) {

		// 包装类型的基本使用方法
		String s = "222";
		
		String sss = "333";
		
		// 这样的话是把两个字符串拼接起来  而不是计算
		System.out.println(s + sss);
		
		Integer i = Integer.parseInt(s);
		Integer i2 = Integer.parseInt(sss);

		// 这样才是将两个变量计算
		System.out.println(i + i2);
	}
	
}
