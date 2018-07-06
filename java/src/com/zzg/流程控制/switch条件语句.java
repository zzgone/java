package com.zzg.流程控制;

public class switch条件语句 {

	/**
	 * switch作用类似else if的写法 
	 * 但是他的不同点在于，switch只能进行等值判断
	 * else if中的 else {} 等同于 switch中的 default
	 * else if中的退出判断是由系统自己控制的，不用开发人员控制。但是switch需要开发人员手动退出该条件判断，使用break关键字
	 * */
	public static void main(String[] args) {

		int x = 1;
		switch (x) {
		case 1:
		case 2:
			System.out.println("x <= 2");
			break;
		case 3:
			System.out.println("x是3");
			break;
		case 4:
			System.out.println("x是4");
			break;
		case 5:
			System.out.println("x是5");
			break;
		default:
			System.out.println("不在5之内");
			break;
		}

	}
}
