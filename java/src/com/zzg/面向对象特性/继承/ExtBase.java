package com.zzg.�����������.�̳�;

import com.zzg.�����������.����.Base;

public class ExtBase extends Base {

	// ����  ��д  �� ���ÿ���������Ķ���
	public double xinYongKa = 55;
	
	
	// ��Ʒ�۸� ��� ���� 55Ԫ�� ��ʹ�� ����� ���ÿ��� ���С�ڻ��ߵ��� 55��Ǯ ��ʹ�� ����� ���ÿ�
	// double money = ��Ʒ�۸�
	// �ؼ��� this �Լ��� super �����
	public void pay(double money) {// ֧��
		
		if (money > 55) {
			System.out.println("ʹ�õĸ�������ÿ�" + super.xinYongKa);
		} else {
			System.out.println("ʹ�õ�����������ÿ�" + this.xinYongKa);
		}
		
	}
	
	public static void main(String[] args) {
		
		ExtBase eb = new ExtBase();
//		System.out.println(eb.xinYongKa);
		eb.pay(54);
		
	}
}
