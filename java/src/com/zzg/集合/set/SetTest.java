package com.zzg.����.set;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	/**
	 * set�޷��洢�ظ�����
	 * */
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		set.add("666");
		set.add("777");
		set.add("666");
		
		for (String s : set) {
			System.out.println(s);
		}
		
	}
	
}
