
package com.zzg.例题大全.类和对象;

public class Car {

	public static int count = 0;// 计数器
	
	public Car() {
		count++;
	}
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		Car c4 = new Car();
		Car c5 = new Car();
		Car c6 = new Car();
		
		System.out.println(Car.count);
		
	}
	
}
