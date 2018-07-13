package com.zzg.异常处理;

public class ExceptionTest {

	/**
	 * Exception 异常
	 * @throws Exception 
	 * 
	 * */

	public static void main(String[] args) throws Exception {
//		asdasd();
//		asdasdfffff();
//		asdas(null);
		
//		ddd();
	}

	/**
	 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 9 at
	 * com.zzg.异常处理.ExceptionTest.main(ExceptionTest.java:14)
	 * 
	 * 这个异常，在main方法里面发生了。
	 * 
	 * 有下划线的字 java.lang.Array.................. 表示为 异常的种类
	 * java.lang.ArrayIndexOutOfBoundsException
	 * 
	 * ArrayIndexOutOfBoundsException 数组下标越界异常 Array 数组 Index 下标 Out 出去、在外 of
	 * 由.. 什么什么什么 Bounds 界限 Exception 异常
	 * 
	 * 后面的：9 是提示给开发者的信息
	 * 
	 * */
	public static void asdasd() {
		// 数组下标越界异常
		int[] i = new int[3];// 创建了一个数组，容量是3，下标对应是 0 1 2
		i[9] = 11;
	}
	
	/**
	 * 数字转换异常
	 * java.lang.NumberFormatException
	 * */
	public static void asdasdfffff() {
		String s = "222dddd";
		
		Integer i = Integer.parseInt(s);
		
	}
	
	/**
	 * 空指针异常
	 * java.lang.NullPointerException
	 * */
	public static void asdas(String a) {
		// 规避空指针
		if (a != null && a.equals("abc")) {
			System.out.println("对的是abc");
		}
		
		System.out.println("程序结束了");
	}
	
	/**
	 * 抛出异常给上级(调用该方法的 就叫上级)
	 * */
	public static void ddd() throws Exception {
		Integer i = Integer.parseInt("asdasdasd");
	}
	

}
