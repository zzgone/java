package com.zzg.���Ի���;

public class ����� {

	public static void main(String[] args) {
		test6();
	}
	
	/**
	 * ���������
	 * */
	public static void test() {
		// �� +
		System.out.println(1 + 1);
		
		// �� -
		System.out.println(1 - 1);
		
		// �� *
		System.out.println(10 * 30);
		
		// �� /
		System.out.println(30 / 10);
		
		// ȡ�� %
		System.out.println(10 % 30);
	}
	
	/**
	 * �������Լ������
	 *
	 * */
	public static void test2() {
		// ���������
		int i = 1;
		i = i + 1;// ��ͳ����д��
		i++;// �����д��
		
		// �Լ������
		int x = 1;
		x = x - 1;
		x--;
	}
	
	
	/**
	 * �Ƚ������
	 * */
	public static void test3() {
		// ����
		System.out.println(1 > 2);
		
		// С��
		System.out.println(1 < 2);
		
		// ����
		System.out.println(1 == 1);
		
		// ������
		System.out.println(1 != 1);
		
		// ���ڻ��ߵ���
		System.out.println(2 >= 2);
		
		// С�ڻ��ߵ���
		System.out.println(1 <= 1);
		
	}
	
	/**
	 * �߼������
	 * && ���ҡ�ʲô��ʲô
	 * */
	public static void test4() {
		// ���� && �߼���  --> ���������ʱ�� ֻҪ������֮һ����������������ʽ��������
		System.out.println(1 == 1 && 2 == 2);
		System.out.println(1 == 1 && 2 == 1);
		System.out.println(1 == 1 && 2 == 2 && 3 == 6);
		
		// ���� || �߼��� --> �������ʱ��ֻҪ������֮һ��������������ʽ������
		System.out.println(1 == 1 || 1 == 2);
		System.out.println(1 == 1 || 2 == 2 || 3 == 9);
		
		// ! �� �߼���
		System.out.println(1 != 1);
		System.out.println(1 != 2);
	}
	
	/**
	 * ��Ԫ�����
	 * 1 == 2 ? 0 : 1;
	 * 
	 * 1 ���� 2 �� �����������0���������������1��
	 * �������������������������
	 * */
	public static void test5() {
		 System.out.println(1 == 1 ? "����" : "������");
	}
	
	/**
	 * �������������
	 * */
	public static void test6() {
		System.out.println(1 + 2 * 3);// 7 �˳����ȼӼ���������
		System.out.println((1 + 2) * 3);// 9 ����������
		
		System.out.println((1 == 1 || 1 == 2) && 2 == 3);
	}
}
