package ���Ի���;

import java.util.ArrayList;
import java.util.List;

public class ѭ�� {

	public static void main(String[] args) {
		
		/*
		 * whileѭ�������ж�������������Ϊ��ʱִ��
		 * */
		System.out.println("while");
		int w1 = 100;
		while (w1 == 60) {// ��������������ִ��
			System.out.println("asdsadasd"); 
			w1 --;
		}
		
		/*
		 * do...whileѭ������ִ��һ�Σ����ж�������������Ϊ��ʱִ��
		 * */
		System.out.println("do..while");
		int w2 = 61;
		do { //��ִ��һ��
			System.out.println("~~~~~~~"); 
			w2 --; // 61 - 1 = 60
		} while (w2 == 60); // �������� ����ִ��
		
		
		/*
		 * �� 0 - 100����ż���ĺ�
		 * */
		System.out.println("for,ż��");
		int fsum = 0;
		for (int i = 2; i <= 100; ) {// i = 2
			fsum = fsum + i;
			// i += 2;
			i = i + 2;
		}
		System.out.println(fsum);
		
		
		/*
		 * �� 0 - 100���������ĺ�
		 * */
		System.out.println("for,����");
		int fsum2 = 0;
		for (int i = 1; i <= 100; ) { // i = 1
			fsum2 = fsum2 + i;
			// i += 2;
			i = i + 2;
		}
		System.out.println(fsum2);
		
		/*
		 * foreach  , foreach�������ͼ��ϣ���ʵ����setֵ�����Ը�������List������, ���������鲻���ԡ�
		 * */
		System.out.println("foreach, ����");
		int[] feArr = {7, 10, 99};
		for (int fi : feArr) {
			System.out.println(fi);
		}
		
		     // �൱��
		
		for (int i = 0; i < feArr.length; i++) {
			int j = feArr[i];
			System.out.println(j);
		}
		
		
		System.out.println("foreach, ���ͼ���");
		Abc a1 = new Abc();
		a1.setId("1");
		a1.setName("a1");
		
		Abc a2 = new Abc();
		a2.setId("2");
		
		List<Abc> listAbc = new ArrayList<>();
		listAbc.add(a1);
		listAbc.add(a2);
		
		for (Abc abc : listAbc) {
			abc.setName("a2"); // ��������ʵ���name����
		}
		
		System.out.println(listAbc.get(0).getName());
		System.out.println(listAbc.get(1).getName());
		
		      // �൱������ע�ʹ���
		
//		for (int i = 0; i < listAbc.size(); i++) {
//			Abc a3 = new Abc();
//			a3 = listAbc.get(i);
//			a3.setName("a2");
//		}
//		
//		System.out.println(listAbc.get(0).getName());
//		System.out.println(listAbc.get(1).getName());
		
		
		
		
		/*
		 * for ��ӡ99�˷���
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