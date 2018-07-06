package com.zzg.流程控制;

public class if条件语句 {

	/**
	 * if 如果
	 * else 否则
	 * 
	 * */
	public static void main(String[] args) {
		
		// 数学分数
		int math = 98;
		// 英语分
		int english = 56;
		
		
		// 单独的if写法， 缺点是 程序速度运行慢，写法更麻烦
		if (math >= 60) {
			System.out.println("数学及格了");
		}
		
		if (math < 60) {
			System.out.println("数学没及格");
		}
		
		// if else 组合写法， 比两个单独的if运行更快
		if (math >= 60) {
			System.out.println("数学及格了");
		} else {
			System.out.println("数学没及格");
		}

		if (english >= 60) {
			System.out.println("英语及格了");
		} else {
			System.out.println("英语没及格");
		}
		
		
		
		
		
		/**
		 * 判断学生的语文分数是优、良、一般、不及格
		 * 优 90-100
		 * 良 80-89
		 * 一般 60-79
		 * 不及格 0-59
		 * */
		int yuwen = 66;
		
		if (yuwen >= 90) {
			System.out.println("优");
		} else if (yuwen >= 80) {
			System.out.println("良");
		} else if (yuwen >= 60) {
			System.out.println("一般");
		} else {
			System.out.println("不及格");
		}
		
	}
}
