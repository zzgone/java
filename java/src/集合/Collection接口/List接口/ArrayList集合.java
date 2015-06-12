package 集合.Collection接口.List接口;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList集合 {

	/**
	 * ArrayList 可以将它理解成一个可增长的数组，它提供快速迭代和快速随机访问的能力。
	 * 
	 * add(int index, Object obj)				用来向集合中指定索性位置添加对象，集合的索引位置从0开始，其他对象的索性位置相对向后移一位
	 * addAll(int index, Conllection coll)		向集合的指定索引位置添加指定的集合对象
	 * remove(int index)						用来移除集合中指定索引位置的徐i想
	 * get(int index)							用于获取指定索引位置的对象
	 * indexOf(Object obj)						该方法返回列表中对象第一次出现的索引位置，如果集合中不包含该元素，则返回-1
	 * lastIndexOf(Object obj)					该方法返回列表中对象最后一次出现的索引位置，如果集合中不包含该元素，则返回-1
	 * subList(int fromIndex, in toIndex)		获取从索引fromIndex 到 toIndex 之间的元素对象
	 * set(int index, E element)				用指定元素替换列表中指定位置的元素，返回以前在指定位置的元素
	 * listIterator								用来获得一个包含所有对象的ListIterator列表迭代器
	 * 
	 * */
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		// add(int index,Object obj)
		list.add("第一个");
		list.add("第二个");
		list.add(1, "扩增");
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
		
		
		// Cellections 接口排序
		list.add("sort1");
		list.add("sort3");
		list.add("sort2");
		Collections.sort(list); // srot method
		for (String string : list) {
			
			System.out.println(string);
		}
		
		
		// 实体排序
		// 实体数据
		SortModel sm1 =  new SortModel();
		SortModel sm2 =  new SortModel();
		SortModel sm3 =  new SortModel();
		
		sm1.setId(7);
		sm1.setName("qi");
		
		sm2.setId(5);
		sm2.setName("wu");
		
		sm3.setId(9);
		sm3.setName("jiu");
		
		// list 数据
		List<SortModel> listSort = new ArrayList<SortModel>();
		listSort.add(sm1);
		listSort.add(sm2);
		listSort.add(sm3);
		
	}
}




// 需要排序的实体
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

