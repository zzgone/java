package com.zzg.���̿���;

public class switch������� {

	/**
	 * switch��������else if��д�� 
	 * �������Ĳ�ͬ�����ڣ�switchֻ�ܽ��е�ֵ�ж�
	 * else if�е� else {} ��ͬ�� switch�е� default
	 * else if�е��˳��ж�����ϵͳ�Լ����Ƶģ����ÿ�����Ա���ơ�����switch��Ҫ������Ա�ֶ��˳��������жϣ�ʹ��break�ؼ���
	 * */
	public static void main(String[] args) {

		int x = 1;
		switch (x) {
		case 1:
		case 2:
			System.out.println("x <= 2");
			break;
		case 3:
			System.out.println("x��3");
			break;
		case 4:
			System.out.println("x��4");
			break;
		case 5:
			System.out.println("x��5");
			break;
		default:
			System.out.println("����5֮��");
			break;
		}

	}
}
