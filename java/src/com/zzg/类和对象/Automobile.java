package com.zzg.类和对象;

public class Automobile {// 汽车类

	private int luntai = 4;

	// 品牌，车主
	
	public void set(String pinpai, String chezhu) {
		System.out.println("该车是" + pinpai + "品牌的，车主是" + chezhu);
		System.out.println("轮胎" + luntai);
	}
	
	
	public Automobile() {
		
	}
	
	public Automobile(String pinpai, String chezhu) {
		System.out.println(pinpai);
		System.out.println(chezhu);
	}
	
	
	private String name;// 卖给了谁
	private double money;// 价格
	private String date;// 日期
	
	// 卖车 这是一个构造方法
	public Automobile(String name, double money, String date) {
		// 这里使用到的是 参数name 而不是 上面的 全局私有变量name
		System.out.println(name);
		System.out.println(money);
		System.out.println(date);
		
		// this指的是 自己，也就是当前类 Automobile
		this.name = name;
		this.money = money;
		this.date = date;
	}
	
	
	public void aa() {
		System.out.println(name);
		System.out.println(money);
		System.out.println(date);
	}
	
	
}
