package com.zzg.���̿���.ѭ��;

public class ѭ���Ľ�����ת {

	/**
	 * continue ���� - ��������ѭ����������һ��ѭ��
	 * break ���� - ������ǰ����ѭ��
	 * return ���� - ������������ ����ѭ��
	 * */
	public static void main(String[] args) {
		
		for (int i = 1; i <= 9; i++) {
			
			System.out.println("ִ����һ��ѭ���� ��ǰ�ǵ�" + i + "��ѭ��");
			
			if (i == 3) {
				System.out.println("continue��");
				continue;
			}
			
			if (i == 5) {
				System.out.println("һ�ж�������");
				return;
			}
			
			if (i == 8) {
				System.out.println("�˳�������ѭ��������");
				break;
			}
			
			
			System.out.println("ѭ������~~~~");
		}
		
		
		System.out.println("asdkljaskljdkasjdkasjdklajskdlaskljd");
	}
}
