package duotai;

public class B extends A{
	int ai = 0;
	static int t = 88;
	
	//main���������̣߳����һ��Ϊexit();debug�ɼ�
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.show());
		B b = new B();
		System.out.println(b.show());
		
		A a1 = new B();//����ָ���������
		System.out.println(a1.show());//�õ�b���������
		System.out.println(a1.show2());
		System.out.println(a1.ai);// A 
		System.out.println(t);// B
		/*
		 * �������ָ���������ʱ��ֻ�ܵ��ø���������Ѿ�����ķ������޷�������������������ķ���
		 * ������û����д���෽��ʱ��ָ������ĸ��������õ��Ǹ��౾��ķ���
		 * */
		
		//�����޷�ָ�������
//		B b1 = (B) new A();
		
		
	}
	
	@Override
	public int show() {
		return 18;
	}
	
	public int show2(){
		
		return 0;
	}
}
