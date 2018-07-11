package com.zzg.例题大全.类和对象;

public class People {

	// 属性：姓名、年龄、性别、身高
	public String name = "小明";
	public int age = 22;
	public char sex = '男';
	public int height = 178;// 单位 厘米
	
	// 行为：说话、计算加法(年龄增加)、改名
	
	/**
	 * 说话
	 * */
	public void say() {
		System.out.println(name + "说了一句话");
	}
	
	/**
	 * 增加年龄
	 * */
	public void addAge() {
		System.out.println(name + "在之前是" + age);
		
		age++;
		
		System.out.println(name + "过完生日后是" + age);
	}
	
	/**
	 * 改名
	 * */
	public void changeName(String newName) {
		name = newName;
		System.out.println("现在这个人叫" + name);
	}
	
	
	
	
	
	
	public People() {
		
	}
	
	public People(String name, int age, char sex, int height) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.height = height;
	}
	
	public void zhangsanSay() {
		System.out.println(name + "说你好");
	}
	
	
	public static void main(String[] args) {
		
//		1.创建一个叫做People的类：
//		属性：姓名、年龄、性别、身高
//		行为：说话、计算加法、改名
		
		People p = new People();
		p.say();// 调用说话的方法
		
		p.addAge();// 给小明过生日
		
		
		p.changeName("小傻逼");
		
		System.out.println(p.name);
		
		
		
		
//		2.创建一个对象：名叫“张三”，性别“男”，年龄18岁，身高1.80；
//		让该对象调用成员方法：
//		说出“你好！”
		
		People zhangsan = new People("张三", 18, '男', 180);
		zhangsan.zhangsanSay();
		
		
	}
}
