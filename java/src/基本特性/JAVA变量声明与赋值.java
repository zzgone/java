package ��������;

public class JAVA���������븳ֵ {

}

class Test1 {  // ������������ ����϶��� 5 10 99
	public static int a;
	public static int b;
	public static int c;
	
	static {
		a = 5;
		b = 10;
		c = 99;
	}
	
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}

class Test2 { // ���� a �Ѿ���ʼ��һ��ֵ,��� 5, ����ļ���˳�򣬾�̬�� �� ��̬���� ����أ�����a = 5, ���ض���
	public static int a = 50;
	public static int b;
	public static int c;
	
	static {
		a = 5;
		b = 10;
		c = 99;
	}
	
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}

class Test3 { // �˴�, ��̬���� c �����ھ�̬��֮��, �������Ȼ��99
	public static int a;
	public static int b;
	
	static {
		a = 5;
		b = 10;
		c = 99;
	}
	
	public static int c;
	
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}

class Test4 { 
	// ��̬����c�Ѿ���ʼ����һ��ֵ, ����ļ���˳��, c Ӧ�� = 99, ��ʵ�� c = 66666, ˵��, java�� ������ <����> �� <��ֵ> ��ʵ�Ƿֿ���
	// �൱�� 1 ����һ������ c, 2 ָ��һ��Ϊ 99 ������ ��c, 3 �� c��ָ��2��,jvmȡ���һ�θ�ֵ,������ʱ c = 66666
	// �˴������Σ�������˵������������һ��������Ȼ��ȡ���һ�θ�ֵ����ָ���������@#%������%����#@��������@
	public static int a = 50;
	public static int b;
	
	static {
		a = 5;
		b = 10;
		c = 99;
	}
	
	public static int c = 66666;
	
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
