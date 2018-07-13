package com.zzg.集合.set;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	/**
	 * set无法存储重复数据
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
