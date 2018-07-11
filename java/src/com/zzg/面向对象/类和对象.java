package com.zzg.面向对象;

public class 类和对象 {

	/**
	 * 了解类里面能写什么。
	 * 1.变量
	 * 2.方法
	 * */
	
	/**
	 * 变量的权限修饰
	 * 
	 * 访问修饰符 
	 * 静态修饰符
	 * */
	public static int a = 1;
	public int b = 1;
	int c = 1;
	
	
	/**
	 * 方法
	 * 
	 * public static String b(int a) 
	 * 访问修饰符 public
	 * 静态修饰符 static 
	 * 返回值 String
	 * 方法名 b()
	 * 参数(int a)
	 * 
	 * 重点：
	 * 是否静态方法，是否有返回值，是否有参数
	 * 
	 * 总结：
	 * 有返回值的方法，都需要在方法体写上return 对应的返回值类型
	 * */
	
	
	/**
	 * 静态、无返回、无参
	 * */
	public static void a() {
		
	}

	/**
	 * 静态、有返回、无参
	 * */
	public static String b() {
		
		return "";
	}
	
	/**
	 * 静态、有返回、有参
	 * */
	public static String c(int a) {
		
		return "";
	}
	
	/**
	 * 非静态、有返回、无参
	 * */
	public String c() {
		return "";
	}
	
}
