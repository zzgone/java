package com.zzg.����.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		
		// list����  <> ������ ��ʾΪ java�� ����
		// ��ⷺ�ͣ�ָ��һ������
		List<String> list = new ArrayList<String>();
		list.add("��1������");// ���һ������
		list.add("��2������");// ���һ������
		list.add("��3������");// ���һ������
		list.add("��4������");// ���һ������
		list.add("��5������");// ���һ������
		list.add("��6������");// ���һ������
		list.add("��7������");// ���һ������
		list.add("��8������");// ���һ������
		list.add("��8������");
		
		String v7 = list.get(7);// �����±��ȡ����
		System.out.println(v7);
		
		/**
		 * ʹ��forѭ�����
		 * */
		System.out.println("ʹ��forѭ�������������������������������������");
		
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			System.out.println(s);
		}
		
		
		/**
		 * ʹ��foreachѭ�����
		 * */
		System.out.println("ʹ��foreach���������������������������������������");
		
		for (String s : list) {
			System.out.println(s);
		}
		
		// ɾ��һ������ �����±�
		list.remove(2);
		
		System.out.println("ɾ�����ݺ󣡣���������������������");
		for (String s : list) {
			System.out.println(s);
		}
		
		// ɾ����������
//		list.removeAll(list);
		
		// ����һ������
		System.out.println(list.contains("��5������"));
		
		// �������ݲ��Ҹ��������ڵ��±�
		System.out.println(list.indexOf("��7������"));
		
	}
}
