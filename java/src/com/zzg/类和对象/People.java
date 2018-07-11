package com.zzg.类和对象;

public class People {

	public String sex = "男";
	public String name = "林智勇";
	
	int age = 52;
	
	private double money = 665656.556;
	
	protected String idcard = "430281199210170316";
	
	public static String aaaaaaaaa = "ajskhdaskldasjdasjkl";
	
	public void eat() {
		System.out.println(name + "开始吃饭");
	}
	
	public void run() {
		System.out.println(name + "开始行走");
	}
	
	private void lookMoney() {
		System.out.println(name + "的钱有" + money);
	}
	
	public static void huxi() {
		System.out.println("每个人都会呼吸");
	}
	
	public static String getAaaaaaaaa() {
		return aaaaaaaaa;
	}
	
	public static void a() {
		System.out.println(aaaaaaaaa);
	}
	
	public void b() {
		System.out.println(aaaaaaaaa);
		System.out.println(sex);
	}
	
}
