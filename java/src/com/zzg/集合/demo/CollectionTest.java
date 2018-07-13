package com.zzg.集合.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionTest {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setName("小明");
		s1.setGrade(1);

		Student s2 = new Student();
		s2.setName("小黄");
		s2.setGrade(1);

		// 学生数组
		Student[] sarray = new Student[5];
		sarray[0] = s1;
		sarray[1] = s2;

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		// 哈希值 hash

		// set 用的是 哈希set
		Set<Student> set = new HashSet<Student>();
		set.add(s1);
		set.add(s1);

		System.out.println(set.size());

		// 学生集合
		List<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);

		// 集合的长度
		System.out.println(list.size());
		
		for (Student stu : list) {
			
			System.out.println(stu.getName());
		}

	}

}