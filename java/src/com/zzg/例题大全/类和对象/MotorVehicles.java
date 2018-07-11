package com.zzg.例题大全.类和对象;

public class MotorVehicles {

	public String no;// 车牌号
	public int speed;// 车速
	public double weight;// 载重量
	
	/**
	 * 加速，车速自增
	 * */
	public void addSpeed() {
		speed++;
	}
	
	/**
	 * 减速，车速自减
	 * */
	public void subtractSpeed() {
		speed--;
	}
	
	/**
	 * 修改车牌号
	 * */
	public void updateNo(String no) {
		this.no = no;
	}
	
	/**
	 * 一个没有形参(没有参数)，在方法中将车牌号设置“XX1234”，速度设置为100，载重量设置为100
	 * */
	public MotorVehicles() {
		this.no = "XX1234";
		this.speed = 100;
		this.weight = 100;
	}
	
	/**
	 * 另一个能为对象的所有属性赋值；
	 * */
	public MotorVehicles(String no, int speed, double weight) {
		this.no = no;
		this.speed = speed;
		this.weight = weight;
	}
	
	
	public static void main(String[] args) {
		
		MotorVehicles mv = new MotorVehicles();
		
		System.out.println("现在机动车的车速是" + mv.speed);
		
		// 我要开车了，车加速一次
		mv.addSpeed();
		
		System.out.println("开车加速后机动车的车速是" + mv.speed);
		
		// 我要减速了
		mv.subtractSpeed();
		
		System.out.println("减速后机动车的车速是" + mv.speed);
		
		// 交通违法了，赶紧修改车牌号跑路
		mv.updateNo("沪 SB520");
		
		System.out.println("看看我的新车牌号" + mv.no);
		
		
		
		
		
		
		System.out.println();
		
		
		// 创建一辆自定义的新车 
		MotorVehicles mv2 = new MotorVehicles("浙B 2501C", 320, 1000);
		System.out.println(mv2.no);
		System.out.println(mv2.speed);
		System.out.println(mv2.weight);
	}
	
}
