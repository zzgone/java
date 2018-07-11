package com.zzg.面向对象特性.继承;

import com.zzg.面向对象特性.抽象.Base;

public class ExtBase extends Base {

	// 子类  重写  了 信用卡这个变量的定义
	public double xinYongKa = 55;
	
	
	// 商品价格 如果 大于 55元， 就使用 父类的 信用卡， 如果小于或者等于 55块钱 就使用 子类的 信用卡
	// double money = 商品价格
	// 关键字 this 自己的 super 父类的
	public void pay(double money) {// 支付
		
		if (money > 55) {
			System.out.println("使用的父类的信用卡" + super.xinYongKa);
		} else {
			System.out.println("使用的是子类的信用卡" + this.xinYongKa);
		}
		
	}
	
	public static void main(String[] args) {
		
		ExtBase eb = new ExtBase();
//		System.out.println(eb.xinYongKa);
		eb.pay(54);
		
	}
}
