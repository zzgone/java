package �ӿڳ�����̳�;

public abstract class �������� {

	/**
	 * �����಻�ܱ�ʵ���������Ҫʵ�������������������ָ��ʵ�����г��󷽷����������
	 * ������Ҫ������̳�
	 * ���������������������Ҳ����������ʵ��
	 * �������еı�����������ͨ��������̬����������
	 * ���󷽷�ֻ��������������ʵ�� abstract void abc(); ����д�� abstract void abc(){};
	 * �����������û�г��󷽷�
	 * ���һ�������г��󷽷����������ֻ���ǳ�����
	 * ���󷽷�Ҫ��ʱ�䣬���Բ����Ǿ�̬�ģ�Ҳ������˽�еġ�
	 * */
	
	String name;
	@SuppressWarnings("unused")
	private String color;
	protected String bgcolor;
	public String background;
	
	public static int age;
	public static final int money = 999999999;
	
	private void getBackground(){
		
	}
	
	void getColor(){
		
	}
	
	protected void getName(){
		
	}
	
	public static void getBgcolor(){
		
	}
	
	// ���󷽷�  ֻ����������
	public abstract int getAge();
	
}
