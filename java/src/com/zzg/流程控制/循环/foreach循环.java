package com.zzg.流程控制.循环;

public class foreach循环 {

	
	/**
	 * forech循环优化了for循环，但只针对于类似数组类数据的
	 * */
	public static void main(String[] args) {
		
		int[] array = new int[3];
		array[0] = 80;
		array[1] = 60;
		array[2] = 77;
		
		for (int a : array) {
			System.out.println(a);
		}
		
	}
}
