package com.zzg;

public class ���� {

	
	/**
	 * int fenshu[] = new int[3];
	 * �����
	 * int fenshu[] �������� �� ���������
	 * new int[3] ����һ������ int�͵ģ���С��3
	 * */
	public static void main(String[] args) {
		// �������� ��СΪ3
		int fenshu[] = new int[3];
		
		// ��ֵ ���±� �� ֵ��
		fenshu[0] = 80;// ����
		fenshu[1] = 60;// ��ѧ
		fenshu[2] = 77;// Ӣ��
		
		System.out.println(fenshu[2]);
		
		
		
		/**
		 * ����������Ķ��ִ�����ʽ
		 * */
		int a[] = new int[1];
		int[] b = new int[1];
		
		int c[] = new int[]{80,60,77};
	
		System.out.println(c[2]);
		
		
		/**
		 * ��ά����
		 * */
		int x[][] = new int[3][4];
		
		x[0][3] = 66;
		
		System.out.println(x[0][3]);
		System.out.println(x[2][3]);
		System.out.println(x[2]);// ��ӡ���� �ڴ��ַ
	}
}
