package com.zzg.�����ȫ;

public class forѭ������ {

	
	public static void main(String[] args) {
		diedaishuzu();
	}
	
	/**
	 * ʹ��forѭ����Ƕ��
	 * ��ӡ�žų˷���
	 * 
	 * \t �Ʊ��
	 * */
	public static void jiujiuchengfa() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j<= i; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();
		}
	}
	
	/**
	 * ʹ��forѭ�� ����(����) һ�����������
	 * */
	public static void diedaishuzu() {
		
		int[] array = new int[3];
		array[0] = 80;
		array[1] = 60;
		array[2] = 77;
		
//		System.out.println(array[0]);
//		System.out.println(array[0]);
//		System.out.println(array[0]);
		
		// length = ���ȵ���˼
		System.out.println(array.length);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}
}
