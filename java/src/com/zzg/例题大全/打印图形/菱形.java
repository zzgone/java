package com.zzg.�����ȫ.��ӡͼ��;

public class ���� {

	// ��ӡ���� ��
	public static void main(String[] args) {
		int line = 7;
		
		int i, j, k;
		
		//�ϰ벿�� ��ӡΪ�������ͣ�����������
		for (i = 1; i <= line; i++) {// ������
			for (j = 1; j <= line - i; j++)// ������ǰ��Ŀո�
				System.out.print(" ");
			for (k = 1; k <= 2 * i - 1; k++)// ����**
				System.out.print("*");
			System.out.println("");// ����
		}

		//�°벿�� �������ĵ���������
		for (i = 1; i <= line - 1; i++) {// �����У����ϰ벿�� ���м���һ��
			for (j = 1; j <= i; j++)// ���ƿո�, j <= i, iΪ1ʱ��1���ո�Ϊ2ʱ��2�����Դ�����
				System.out.print(" ");
			for (k = 1; k <= (line * 2 - 1) - 2 * i; k++)// (line * 2 - 1) line*2Ϊ������,-1ΪҪ���ϲ�����1�� 
				System.out.print("*");
			System.out.println("");// ����
		}
		
		
		System.out.println("============================");
		
		
		// ��ӡ��������
		int n = 12;
		int height = n >> 1;
		for (i = -height; i <= height; i++) {
			for (j = n; j >= 0; j--) {
				if((j + i) % n == 0 || (j - i) % n == 0){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
