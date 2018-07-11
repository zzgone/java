package com.zzg.面向对象;

public class 人 {

	/**
	 * 当调用类中的静态方法时，只需要通过类名 点出 方法名
	 * 当调用类中的普通方法时，需要先创建类对象，再通过类对象去 点出 方法名
	 * */
	
	public static void main(String[] args) {
	
		// 先创建出 类对象
		人 aaaa = new 人();
		
		// 调用类中的 非静态方法
		aaaa.拔头发("小明");
		
		人.哭();
		
		new 人().拔头发("小黄");
	}
	
	public static void 哭() {
		System.out.println("小孩子一生下来就知道怎么哭");
	}
	
	public void 拔头发(String name) {
		System.out.println(name + "正在拔头发");
	}
}
