package com.zzg.语言基础;

public class 基本类型转换 {

	public static void main(String[] args) {
		
		byte b = 1;
		short s  = 1;
		int i = 1;
		long l = 1;
		
		// 强制转型
		b = (byte) l;
		System.out.println(b);
		
		// 小数强转成int整数   结果为：会丢弃所有的小数，不进行四舍五入 
		int x = (int) 5.8888;
		System.out.println(x);
		
		
		boolean a = 1 == 1;
		System.out.println(a);
	}
}
