package com.zzg.面向对象特性.抽象;

public abstract class Cigarette {

	public int i = 111;
	
	public void test1() {
		System.out.println("Cigarette test1()");
	}
	
	/**
	 * 把烟味抽象成一个方法
	 * 
	 * abstract 抽象方法关键字
	 * */
	public abstract void yanwei();
	
	/**
	 * 把价格抽象成一个方法
	 * */
	public abstract void price();
	
	
}
