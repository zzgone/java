package com.zzg.�����ȫ.��Ͷ���;

public class People {

	// ���ԣ����������䡢�Ա����
	public String name = "С��";
	public int age = 22;
	public char sex = '��';
	public int height = 178;// ��λ ����
	
	// ��Ϊ��˵��������ӷ�(��������)������
	
	/**
	 * ˵��
	 * */
	public void say() {
		System.out.println(name + "˵��һ�仰");
	}
	
	/**
	 * ��������
	 * */
	public void addAge() {
		System.out.println(name + "��֮ǰ��" + age);
		
		age++;
		
		System.out.println(name + "�������պ���" + age);
	}
	
	/**
	 * ����
	 * */
	public void changeName(String newName) {
		name = newName;
		System.out.println("��������˽�" + name);
	}
	
	
	
	
	
	
	public People() {
		
	}
	
	public People(String name, int age, char sex, int height) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.height = height;
	}
	
	public void zhangsanSay() {
		System.out.println(name + "˵���");
	}
	
	
	public static void main(String[] args) {
		
//		1.����һ������People���ࣺ
//		���ԣ����������䡢�Ա����
//		��Ϊ��˵��������ӷ�������
		
		People p = new People();
		p.say();// ����˵���ķ���
		
		p.addAge();// ��С��������
		
		
		p.changeName("Сɵ��");
		
		System.out.println(p.name);
		
		
		
		
//		2.����һ���������С����������Ա��С�������18�꣬���1.80��
//		�øö�����ó�Ա������
//		˵������ã���
		
		People zhangsan = new People("����", 18, '��', 180);
		zhangsan.zhangsanSay();
		
		
	}
}
