package �ӿڳ�����;

public interface ���ӿ� {
	/**
	 * �ӿڲ���ʵ���������Ҫʵ�������ӿڱ�������ָ��ʵ�����нӿڷ����������
	 * �ӿ�Ҫ����ʵ��
	 * �ӿ�ֻ������������
	 * �ӿ��ﶨ��ı���ֻ���ǹ����ľ�̬�ĳ���
	 * һ��ʵ�ֽӿڵ��࣬�粻��ȫ��ʵ�ֽӿڷ�������ô����Ҳֻ��Ϊ������
	 * �ӿڿɼ̳нӿڣ����ɶ�̳нӿڣ�����ֻ�ܵ����̳�
	 * */
	
	/*
	 * ��������
	 * */
	public static final String name = "����";
	
	// �ӿ���Ĭ�ϵĳ�Ա����Ĭ�����η�Ϊ public static final
	int age = 100;
	
	StringBuffer like = new StringBuffer("�Է�˯���򶹶�");
	
	/*
	 * ��������
	 * */
	String getName();
	
	// ����Ĭ�����η�Ϊ public abstract Ҳֻ��Ϊ���������η�
	public abstract int getAge();
}


