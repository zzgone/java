package com.zzg.��Ͷ���;

public class Automobile {// ������

	private int luntai = 4;

	// Ʒ�ƣ�����
	
	public void set(String pinpai, String chezhu) {
		System.out.println("�ó���" + pinpai + "Ʒ�Ƶģ�������" + chezhu);
		System.out.println("��̥" + luntai);
	}
	
	
	public Automobile() {
		
	}
	
	public Automobile(String pinpai, String chezhu) {
		System.out.println(pinpai);
		System.out.println(chezhu);
	}
	
	
	private String name;// ������˭
	private double money;// �۸�
	private String date;// ����
	
	// ���� ����һ�����췽��
	public Automobile(String name, double money, String date) {
		// ����ʹ�õ����� ����name ������ ����� ȫ��˽�б���name
		System.out.println(name);
		System.out.println(money);
		System.out.println(date);
		
		// thisָ���� �Լ���Ҳ���ǵ�ǰ�� Automobile
		this.name = name;
		this.money = money;
		this.date = date;
	}
	
	
	public void aa() {
		System.out.println(name);
		System.out.println(money);
		System.out.println(date);
	}
	
	
}
