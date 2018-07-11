package com.zzg.类和对象;

public class 类的所有定义 {

	/**
	 * 常量
	 * 静态变量
	 * 全局变量
	 * 局部变量
	 * 
	 * 静态方法
	 * 普通方法
	 * 构造方法
	 * */
	
	// 常量
	public static final int f = 1;
	
	// 静态变量
	public static int a = 1;
	
	// 全局变量
	public int b = 1;
	
	// 局部变量
	public void abc() {
		int w = 1;
	}
	
	public void def() {
		int r = 1;
		System.out.println(b);
//		System.out.println(w);// 这里不行，因为w是局部变量，定义在abc()方法中
	}
	
	// 普通方法
	public void asdaf() {
		
	}
	
	// 有返回的普通方法
	public String asdasdasd() {
		return "asdasd";
	}
	
	//  有参数有返回的普通方法
	public String asdad(int abcfff) {
		System.out.println(abcfff);
		return "asdasdasdas";
	}
	
	// 静态方法
	public static void asdasd() {
		
	}
	
	// 构造方法 详细请看 GouZao.java

}
