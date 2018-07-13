package com.zzg.异常处理;

public class TestDemo {

	public static void main(String[] args) {
		
		try {// 尝试，试一试。尝试解决这个异常
			String s = "123";
			Integer i = Integer.parseInt(s);
		} catch (Exception e) {// 捕获，当 异常发生后，会进入 捕获区
			
			System.out.println("不能转换为数字，请重新输入");
			
//			e.printStackTrace();
			
			
		} finally {// 无论你的程序 是否发生异常，这里都会被执行
			
			System.out.println("我呗强制执行");
			
		}
		
		System.out.println("正常结束");
	}
}
