package com.zzg.���Ի���;

import java.util.Scanner;

public class ��������� {
	
	public static void main(String[] args) {
		test4();
	}

	/**
	 * �ж����ֵ���ż��
	 * ���� ���� ����2����
	 * ż�� ˫�� ��2����
	 * */
	public static void test1() {
		Scanner s = new Scanner(System.in);// һ���������
		System.out.println("������һ������");
		long n = s.nextLong();// ���������
		
		System.out.println(n % 2 == 0 ? "ż��" : "����");
	}
	
	/**
	 * �������꣬ƽ��
	 * */
	public static void test3() {
		Scanner s = new Scanner(System.in);// һ���������
		System.out.println("������һ�����");
		long year = s.nextLong();// ���������

		boolean b = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		System.out.println(year + "��" + b);
	}
	
	/**
	 * �������꣬ƽ��
	 * */
	public static void test4() {
		Scanner s = new Scanner(System.in);// һ���������
		System.out.println("���������εİ뾶");
		double r = s.nextDouble();// ���������
		
		final double PI = 3.1415926;
		double v = 4.0 / 3.0 * PI * r * r * r;
		System.out.println("�����" + v);
	}
	
}
