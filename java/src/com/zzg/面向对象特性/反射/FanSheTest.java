package com.zzg.�����������.����;

import java.lang.reflect.Method;

public class FanSheTest {

	public int a = 5;
	
	public void test() {
		System.out.println(a);
	}
	
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		Class<?> clazz = FanSheTest.class;
		System.out.println(clazz.getName());// ��������
		System.out.println(clazz.getPackage());// ��·��
		
		FanSheTest fst = (FanSheTest) clazz.newInstance();
		
		Method[] method = clazz.getMethods();// ��ȡ��������
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
