package com.zzg.�������;

public class �� {

	/**
	 * ���������еľ�̬����ʱ��ֻ��Ҫͨ������ ��� ������
	 * ���������е���ͨ����ʱ����Ҫ�ȴ����������ͨ�������ȥ ��� ������
	 * */
	
	public static void main(String[] args) {
	
		// �ȴ����� �����
		�� aaaa = new ��();
		
		// �������е� �Ǿ�̬����
		aaaa.��ͷ��("С��");
		
		��.��();
		
		new ��().��ͷ��("С��");
	}
	
	public static void ��() {
		System.out.println("С����һ��������֪����ô��");
	}
	
	public void ��ͷ��(String name) {
		System.out.println(name + "���ڰ�ͷ��");
	}
}
