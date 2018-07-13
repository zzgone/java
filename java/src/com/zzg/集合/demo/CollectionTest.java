package com.zzg.����.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionTest {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setName("С��");
		s1.setGrade(1);

		Student s2 = new Student();
		s2.setName("С��");
		s2.setGrade(1);

		// ѧ������
		Student[] sarray = new Student[5];
		sarray[0] = s1;
		sarray[1] = s2;

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		// ��ϣֵ hash

		// set �õ��� ��ϣset
		Set<Student> set = new HashSet<Student>();
		set.add(s1);
		set.add(s1);

		System.out.println(set.size());

		// ѧ������
		List<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);

		// ���ϵĳ���
		System.out.println(list.size());
		
		for (Student stu : list) {
			
			System.out.println(stu.getName());
		}

	}

}