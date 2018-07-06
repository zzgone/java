package com.zzg;

public class 字符串 {

	/**
	 * String 字符串
	 * 字符串不同于java的8大基本类型
	 * 但是，他是用来存储字符数据的一个类型
	 * 定义：
	 * String s = "";
	 * String s = new String();
	 * String s = new String("");
	 * 
	 * 默认值 不是0  也不是0.0d 而是 null 表示为一个空
	 * */
	public static void main(String[] args) {
		
		String a = null;// 空
		System.out.println(a);
		
		String b = "";// 空串 = 空字符串
		
		String c = new String();// null
		
		String d = new String("");// ""
		
		String x = "asdiasdhajskhdajskjkdasjkdahsjkhd";
		
		System.out.println(x);
		
		System.out.println("啊上单，送到哪没事的");
	}
}
