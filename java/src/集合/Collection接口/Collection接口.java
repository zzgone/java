package ����.Collection�ӿ�;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection�ӿ� {

	/**
	 * Collection�ӿ��� Set ��List �� Queue �ӿڵĸ��ӿڣ��ṩ�˶������ϳ��õķ������������� add()��remove()��contains() ��size() ��iterator() �ȡ�
	 * 
	 * add(E e)					��ָ��������ӵ�������
	 * remove(Object o)			��ָ���Ķ���Ӽ������Ƴ����Ƴ��ɹ�����true,���ɹ�����false
	 * contains(Object o)		�鿴�ü������Ƿ����ָ���Ķ��󣬰�������true,����������flase
	 * size()		 			���ؼ����д�ŵĶ���ĸ���������ֵΪint 
	 * clear()					�Ƴ��ü����е����ж�����ոü��ϡ�
	 * iterator()				����һ���������ж����iterator��������ѭ������
	 * toArray()				����һ���������ж��������,������Object
	 * toArray(T[] t)			 ����һ���������ж����ָ�����͵����� 
	 * 
	 * */
	
	
	//����������ֻ��һ���Ѽ���ת����������ӣ���ΪCollection�����Ǹ��ӿ����ԣ�����������ʵ����ArrayList��������ӣ�
	public static void main(String[] args) {
		String a = "a",b="b",c="c";
		Collection<String> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		list.add(c);
	
		// contains ����
		System.out.println(list.contains("a"));
		System.out.println(list.contains("z"));
		
		// containsAll ����ȫ��
		Collection<String> list2 = new ArrayList<>();
		list2.add(a);
		list2.add(b);
		list2.add(c);
		
		//����������ͬ��
		System.out.println(list.containsAll(list2));
		
		//�������ݲ�ͬ��
		list2.add("z");// ����
		System.out.println(list.containsAll(list2));
		
		// remove 
		list2.add(a);
		list2.remove(a); // ɾ����һ��a �����ظ�������Ӱ��~ ����ѭ��ִ�д˷���
		for (String string : list2) {
			System.out.println(string);
		}
		System.out.println("~~~");
		
		// removeAll
		list2.removeAll(list);// ɾ�����к�listƥ�������, ���������ظ�������
		for (String string : list2) {
			System.out.println(string);
		}
		System.out.println("~~~~");
		
		// clear
		list2.clear(); // ���
		System.out.println(list2.size());// ���ϴ�С
		System.out.println("~~~");
		
		// toArray(T[] t)
		String[] array =  list.toArray(new String[1]);// �����С
		for (String string : array) {
			System.out.println(string);
		}
		
		System.out.println("~~~");
		
		Iterator<String> ite = list.iterator();
		while (ite.hasNext()) {
			String string = (String) ite.next();
			System.out.println(string);
		}
	}
	
}
