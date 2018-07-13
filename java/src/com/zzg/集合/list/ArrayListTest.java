package com.zzg.集合.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		
		// list集合  <> 尖括号 表示为 java的 泛型
		// 理解泛型：指定一个类型
		List<String> list = new ArrayList<String>();
		list.add("第1个数据");// 添加一条数据
		list.add("第2个数据");// 添加一条数据
		list.add("第3个数据");// 添加一条数据
		list.add("第4个数据");// 添加一条数据
		list.add("第5个数据");// 添加一条数据
		list.add("第6个数据");// 添加一条数据
		list.add("第7个数据");// 添加一条数据
		list.add("第8个数据");// 添加一条数据
		list.add("第8个数据");
		
		String v7 = list.get(7);// 根据下标获取数据
		System.out.println(v7);
		
		/**
		 * 使用for循环输出
		 * */
		System.out.println("使用for循环输出！！！！！！！！！！！！！！！！");
		
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			System.out.println(s);
		}
		
		
		/**
		 * 使用foreach循环输出
		 * */
		System.out.println("使用foreach输出！！！！！！！！！！！！！！！！！！");
		
		for (String s : list) {
			System.out.println(s);
		}
		
		// 删除一条数据 根据下标
		list.remove(2);
		
		System.out.println("删除数据后！！！！！！！！！！！！");
		for (String s : list) {
			System.out.println(s);
		}
		
		// 删除所有数据
//		list.removeAll(list);
		
		// 包含一个数据
		System.out.println(list.contains("第5个数据"));
		
		// 根据数据查找该数据所在的下标
		System.out.println(list.indexOf("第7个数据"));
		
	}
}
