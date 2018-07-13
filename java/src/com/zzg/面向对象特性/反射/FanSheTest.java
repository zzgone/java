package com.zzg.面向对象特性.反射;

import java.lang.reflect.Method;

public class FanSheTest {

	public int a = 5;
	
	public void test() {
		System.out.println(a);
	}
	
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		Class<?> clazz = FanSheTest.class;
		System.out.println(clazz.getName());// 完整类名
		System.out.println(clazz.getPackage());// 包路径
		
		FanSheTest fst = (FanSheTest) clazz.newInstance();
		
		Method[] method = clazz.getMethods();// 获取方法数组
		for (Method m : method) {
			
			if (m.getName().equals("test")) {
				try {
					m.invoke(fst);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			System.out.println(m.getName());
		}
		
	}
}
