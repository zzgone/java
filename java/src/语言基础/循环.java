package 语言基础;

import java.util.ArrayList;
import java.util.List;

public class 循环 {

	public static void main(String[] args) {
		
		/*
		 * while循环，先判断条件，当条件为真时执行
		 * */
		System.out.println("while");
		int w1 = 100;
		while (w1 == 60) {// 条件不成立，不执行
			System.out.println("asdsadasd"); 
			w1 --;
		}
		
		/*
		 * do...while循环，先执行一次，再判断条件，当条件为真时执行
		 * */
		System.out.println("do..while");
		int w2 = 61;
		do { //先执行一次
			System.out.println("~~~~~~~"); 
			w2 --; // 61 - 1 = 60
		} while (w2 == 60); // 条件成立 继续执行
		
		
		/*
		 * 求 0 - 100所有偶数的和
		 * */
		System.out.println("for,偶数");
		int fsum = 0;
		for (int i = 2; i <= 100; ) {// i = 2
			fsum = fsum + i;
			// i += 2;
			i = i + 2;
		}
		System.out.println(fsum);
		
		
		/*
		 * 求 0 - 100所有奇数的和
		 * */
		System.out.println("for,奇数");
		int fsum2 = 0;
		for (int i = 1; i <= 100; ) { // i = 1
			fsum2 = fsum2 + i;
			// i += 2;
			i = i + 2;
		}
		System.out.println(fsum2);
		
		/*
		 * foreach  , foreach遍历泛型集合，往实体中set值，可以更改整个List的数据, 而遍历数组不可以。
		 * */
		System.out.println("foreach, 数组");
		int[] feArr = {7, 10, 99};
		for (int fi : feArr) {
			System.out.println(fi);
		}
		
		     // 相当于
		
		for (int i = 0; i < feArr.length; i++) {
			int j = feArr[i];
			System.out.println(j);
		}
		
		
		System.out.println("foreach, 泛型集合");
		Abc a1 = new Abc();
		a1.setId("1");
		a1.setName("a1");
		
		Abc a2 = new Abc();
		a2.setId("2");
		
		List<Abc> listAbc = new ArrayList<>();
		listAbc.add(a1);
		listAbc.add(a2);
		
		for (Abc abc : listAbc) {
			abc.setName("a2"); // 更改两个实体的name属性
		}
		
		System.out.println(listAbc.get(0).getName());
		System.out.println(listAbc.get(1).getName());
		
		      // 相当于以下注释代码
		
//		for (int i = 0; i < listAbc.size(); i++) {
//			Abc a3 = new Abc();
//			a3 = listAbc.get(i);
//			a3.setName("a2");
//		}
//		
//		System.out.println(listAbc.get(0).getName());
//		System.out.println(listAbc.get(1).getName());
		
		
		
		
		/*
		 * for 打印99乘法表
		 * */
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + j * i + "\t");
			}
			System.out.println();
		}
		
		
		
	}
}



class Abc{
	
	String name;
	String id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}