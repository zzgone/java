package ����.Collection�ӿ�.List�ӿ�;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList���� {

	/**
	 * ArrayList ���Խ�������һ�������������飬���ṩ���ٵ����Ϳ���������ʵ�������
	 * 
	 * add(int index, Object obj)				�����򼯺���ָ������λ����Ӷ��󣬼��ϵ�����λ�ô�0��ʼ���������������λ����������һλ
	 * addAll(int index, Conllection coll)		�򼯺ϵ�ָ������λ�����ָ���ļ��϶���
	 * remove(int index)						�����Ƴ�������ָ������λ�õ���i��
	 * get(int index)							���ڻ�ȡָ������λ�õĶ���
	 * indexOf(Object obj)						�÷��������б��ж����һ�γ��ֵ�����λ�ã���������в�������Ԫ�أ��򷵻�-1
	 * lastIndexOf(Object obj)					�÷��������б��ж������һ�γ��ֵ�����λ�ã���������в�������Ԫ�أ��򷵻�-1
	 * subList(int fromIndex, in toIndex)		��ȡ������fromIndex �� toIndex ֮���Ԫ�ض���
	 * set(int index, E element)				��ָ��Ԫ���滻�б���ָ��λ�õ�Ԫ�أ�������ǰ��ָ��λ�õ�Ԫ��
	 * listIterator								�������һ���������ж����ListIterator�б������
	 * 
	 * */
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		// add(int index,Object obj)
		list.add("��һ��");
		list.add("�ڶ���");
		list.add(1, "����");
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println(list.size());
		System.out.println("~~~");
		
		// remove(int index)
		list.remove(1);
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("~~~~");
		
		
		// Cellections �ӿ�����
		list.add("sort1");
		list.add("sort3");
		list.add("sort2");
		Collections.sort(list); // srot method
		for (String string : list) {
			
			System.out.println(string);
		}
		
		
		// ʵ������
		// ʵ������
		SortModel sm1 =  new SortModel();
		SortModel sm2 =  new SortModel();
		SortModel sm3 =  new SortModel();
		
		sm1.setId(7);
		sm1.setName("qi");
		
		sm2.setId(5);
		sm2.setName("wu");
		
		sm3.setId(9);
		sm3.setName("jiu");
		
		// list ����
		List<SortModel> listSort = new ArrayList<SortModel>();
		listSort.add(sm1);
		listSort.add(sm2);
		listSort.add(sm3);
		
	}
}




// ��Ҫ�����ʵ��
class SortModel{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

