package ��������_δ����;

public class ָ���ʵ��������{
	
	/**
	 * �̳� ����������� �������๹�췽��ʱ  ��������Ȥ������
	 * */
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		sub s = new sub();// 1 �����������
		
		// ���� ���� ����ʵ��������  ���õ��������ж�������ԣ�����3������
		base b = new sub();
		
		
		// 3 ���� 
		// display��getclass�����ĵ���ȡ���� ʵ����(new Class, new ��һ������Ҳ��Ϊʵ����һ������ ) ��������һ����
		// ������new sub�������ڹ���base()��ʱ����Ȼ��ʵ����sub������getClassʱ��Ȼ�ǵõ���sub����
	}
}

class base {
	private int i = 22;
	public void display(){
		System.out.println(i);
	}
	
	public base(){
		display();// 2 �����������Ǽ̳й�ϵ�������й��췽�������Ի��ȹ���������󣬵��ô˷���������������д�˴˷��������Ե��õ�ʵ�����������display����������ʱ���� i ��û�ж���ֵ������Ĭ��Ϊ 0
		System.out.println(this.getClass().toString());// �����๹���Ķ�������getClass�ǻ�������class
	}
}

class sub extends base{
	private int i = 100;
//	private Integer i = 100;//integer��Ĭ��ֵ��null������Ϊ��װ���͵�ʱ�򷵻�Ϊ null class..sub 100;
	@Override
	public void display() {
		System.out.println(i);
	}
	public sub(){
		display();
	}
	 	
}


