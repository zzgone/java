package com.zzg.���̿���;

public class if������� {

	/**
	 * if ���
	 * else ����
	 * 
	 * */
	public static void main(String[] args) {
		
		// ��ѧ����
		int math = 98;
		// Ӣ���
		int english = 56;
		
		
		// ������ifд���� ȱ���� �����ٶ���������д�����鷳
		if (math >= 60) {
			System.out.println("��ѧ������");
		}
		
		if (math < 60) {
			System.out.println("��ѧû����");
		}
		
		// if else ���д���� ������������if���и���
		if (math >= 60) {
			System.out.println("��ѧ������");
		} else {
			System.out.println("��ѧû����");
		}

		if (english >= 60) {
			System.out.println("Ӣ�Ｐ����");
		} else {
			System.out.println("Ӣ��û����");
		}
		
		
		
		
		
		/**
		 * �ж�ѧ�������ķ������š�����һ�㡢������
		 * �� 90-100
		 * �� 80-89
		 * һ�� 60-79
		 * ������ 0-59
		 * */
		int yuwen = 66;
		
		if (yuwen >= 90) {
			System.out.println("��");
		} else if (yuwen >= 80) {
			System.out.println("��");
		} else if (yuwen >= 60) {
			System.out.println("һ��");
		} else {
			System.out.println("������");
		}
		
	}
}
