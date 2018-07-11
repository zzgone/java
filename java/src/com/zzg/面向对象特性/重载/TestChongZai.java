package com.zzg.面向对象特性.重载;

public class TestChongZai {
	
	/**
	 * 构造方法的重载
	 * */

	public TestChongZai() {
		
	}
	
	public TestChongZai(String a) {
		
	}
	
	public TestChongZai(int a) {
		
	}
	
	/**
	 * 方法的重载
	 * */
	
	public void a() {
		System.out.println("");
	}
	
	public void a(int a) {
		System.out.println();
	}
	
	public void a(String a, int x) {
		
	}
	
	public void a(int x, String a) {
		
	}
	
//	public String a() {
//		return "";
//	}
	
	
}
