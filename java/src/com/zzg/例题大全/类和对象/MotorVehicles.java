package com.zzg.�����ȫ.��Ͷ���;

public class MotorVehicles {

	public String no;// ���ƺ�
	public int speed;// ����
	public double weight;// ������
	
	/**
	 * ���٣���������
	 * */
	public void addSpeed() {
		speed++;
	}
	
	/**
	 * ���٣������Լ�
	 * */
	public void subtractSpeed() {
		speed--;
	}
	
	/**
	 * �޸ĳ��ƺ�
	 * */
	public void updateNo(String no) {
		this.no = no;
	}
	
	/**
	 * һ��û���β�(û�в���)���ڷ����н����ƺ����á�XX1234�����ٶ�����Ϊ100������������Ϊ100
	 * */
	public MotorVehicles() {
		this.no = "XX1234";
		this.speed = 100;
		this.weight = 100;
	}
	
	/**
	 * ��һ����Ϊ������������Ը�ֵ��
	 * */
	public MotorVehicles(String no, int speed, double weight) {
		this.no = no;
		this.speed = speed;
		this.weight = weight;
	}
	
	
	public static void main(String[] args) {
		
		MotorVehicles mv = new MotorVehicles();
		
		System.out.println("���ڻ������ĳ�����" + mv.speed);
		
		// ��Ҫ�����ˣ�������һ��
		mv.addSpeed();
		
		System.out.println("�������ٺ�������ĳ�����" + mv.speed);
		
		// ��Ҫ������
		mv.subtractSpeed();
		
		System.out.println("���ٺ�������ĳ�����" + mv.speed);
		
		// ��ͨΥ���ˣ��Ͻ��޸ĳ��ƺ���·
		mv.updateNo("�� SB520");
		
		System.out.println("�����ҵ��³��ƺ�" + mv.no);
		
		
		
		
		
		
		System.out.println();
		
		
		// ����һ���Զ�����³� 
		MotorVehicles mv2 = new MotorVehicles("��B 2501C", 320, 1000);
		System.out.println(mv2.no);
		System.out.println(mv2.speed);
		System.out.println(mv2.weight);
	}
	
}
