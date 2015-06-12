package 集合.Collection接口;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection接口 {

	/**
	 * Collection接口是 Set 、List 和 Queue 接口的父接口，提供了多数集合常用的方法声明，包括 add()、remove()、contains() 、size() 、iterator() 等。
	 * 
	 * add(E e)					将指定对象添加到集合中
	 * remove(Object o)			将指定的对象从集合中移除，移除成功返回true,不成功返回false
	 * contains(Object o)		查看该集合中是否包含指定的对象，包含返回true,不包含返回flase
	 * size()		 			返回集合中存放的对象的个数。返回值为int 
	 * clear()					移除该集合中的所有对象，清空该集合。
	 * iterator()				返回一个包含所有对象的iterator对象，用来循环遍历
	 * toArray()				返回一个包含所有对象的数组,类型是Object
	 * toArray(T[] t)			 返回一个包含所有对象的指定类型的数组 
	 * 
	 * */
	
	
	//我们在这里只举一个把集合转成数组的例子，因为Collection本身是个接口所以，我们用它的实现类ArrayList做这个例子：
	public static void main(String[] args) {
		String a = "a",b="b",c="c";
		Collection<String> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		list.add(c);
	
		// contains 包含
		System.out.println(list.contains("a"));
		System.out.println(list.contains("z"));
		
		// containsAll 包含全部
		Collection<String> list2 = new ArrayList<>();
		list2.add(a);
		list2.add(b);
		list2.add(c);
		
		//包含数据相同的
		System.out.println(list.containsAll(list2));
		
		//包含数据不同的
		list2.add("z");// 增加
		System.out.println(list.containsAll(list2));
		
		// remove 
		list2.add(a);
		list2.remove(a); // 删除第一个a 后面重复数据无影响~ 可用循环执行此方法
		for (String string : list2) {
			System.out.println(string);
		}
		System.out.println("~~~");
		
		// removeAll
		list2.removeAll(list);// 删除所有和list匹配的数据, 包括后面重复的数据
		for (String string : list2) {
			System.out.println(string);
		}
		System.out.println("~~~~");
		
		// clear
		list2.clear(); // 清空
		System.out.println(list2.size());// 集合大小
		System.out.println("~~~");
		
		// toArray(T[] t)
		String[] array =  list.toArray(new String[1]);// 数组大小
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
