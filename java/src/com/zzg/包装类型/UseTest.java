package com.zzg.��װ����;

public class UseTest {

	/**
	 * ��װ������8������Ӧ8����������
	 * jdk���Զ�װ���
	 * ������Ҫʹ��
	 * Integer i = new Integer(1);������һ��integer����
	 * ֻ��Ҫ
	 * Integer i = 1;����
	 * */
	public static void main(String[] args) {

		// ��װ���͵Ļ���ʹ�÷���
		String s = "222";
		
		String sss = "333";
		
		// �����Ļ��ǰ������ַ���ƴ������  �����Ǽ���
		System.out.println(s + sss);
		
		Integer i = Integer.parseInt(s);
		Integer i2 = Integer.parseInt(sss);

		// �������ǽ�������������
		System.out.println(i + i2);
	}
	
}
