package com.zzg.类和对象;

public class GouZao {

	/**
	 * 构造方法
	 * 没有返回值
	 * 可以允许有参数，也可以没有
	 * 与类名同名的方法就是构造方法
	 * 
	 * 
	 * 每一个类中，哪怕你没有写构造方法，其实也默认有一个 public Gouzao() {} 默认的构造方法
	 * */
	
	
	
	public GouZao() {
		System.out.println("默认的构造方法");
	}
	
	public GouZao(int a) {
		System.out.println("有int a的构造方法，a=" + a);
	}
	
	public GouZao(int b, String a) {
		System.out.println("ajhskdajhskdasdjhk");
	}
	
	public GouZao(String s) {
		System.out.println("有String s的构造方法，s=" + s);
	}
}
