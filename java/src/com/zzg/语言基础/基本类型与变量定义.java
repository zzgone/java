package com.zzg.语言基础;

public class 基本类型与变量定义 {

	/**
	 * 8种基本类型
	 * 
	 * 数字类：
	 * 	整数：
	 * 		短整型	short
	 * 		整型		int
	 * 		长整型	long
	 * 	小数：
	 * 		单精度	float
	 * 		双精度	double
	 * 
	 * 极小整型类：
	 * 	byte
	 * 
	 * 字符类：
	 * 	char 只能存放一个字符
	 * 
	 * 结果类
	 * 	boolean	只能存放两种数据 真(true) 或 假(false)
	 * 
	 * */
	
	
	/**
	 * 如何定义各个基本类型的语法
	 * 
	 * 定义变量
	 * 变量定义的解读方式： int a = 1; 
	 * int 变量的类型
	 * a 变量的名称
	 * 1 变量的值
	 * 
	 * 一头猪 名字是朱琪 = "丑，肥，想吐高一米不知道多少";
	 * */
	public static void main(String[] args) {
		// 短整型
		short s = 12312;
		
		// 整型
		int a = 11234124; 
		
		// 长整型
		long l = 2230000000L;
		
		// 单精度
		float f = 12312.124124124124124124115412412412412412412412412412412412412412412412424f;
		System.out.println(f);
		
		// 双精度
		double d = 126783.167891234896712467895123434689512368951223678951d;
		System.out.println(d);
		
		// 字符
		char c = 'x';
		
		// 结果类- 布尔类型
		boolean b = false;
		boolean b2 = true;
		
		System.out.println(b);
		System.out.println(b2);
		
		// 极小整型
		byte byte1 = 123;
		System.out.println(byte1);
	}
	
}
