package ��������_δ����;

public class ��ļ���˳�� {
	/** -- δ�̳�
	 * -- ��δʵ����
	   1 ������̬����
	   2 ���ؾ�̬����
	   3 ���ؾ�̬�����
	   
	   -- ��ʵ����
	   4 ������ͨ��Ա����
	   5 ������ͨ����
	   6 ���طǾ�̬��
	   7 ���ع��췽��
	   
	   �ܽᣬ���˸о������뷽��Ҫ�������κο飬��Ȼ������û������
	 * */
	
	/** -- �̳�
	 -- δʵ����
	 1 ����<����>��̬����
	 2 ����<����>��̬����
	 3 ����<����>��̬��
	 
	 4 ����<����>��̬����
	 5 ����<����>��̬����
	 6 ����<����>��̬��
	 
	 -- ����ʵ���� �������Ҫʵ��������Ļ�~��
	 	<����>  -- ��ͨ���� �� ��ͨ����
		<����>  -- �Ǿ�̬��ʼ����
		<����>  -- ���췽��
	 -- ����ʵ���� ��ʵ����������Զ�ʵ�������࣬ͨ����˵����ְֻ�û���������Ӵ�����������
	 7 ����<����>��ͨ���� �� ��ͨ����  ���������b����m2���������ڹ���ʵ����������Ĺ�ϵ����������ʵ�����ĵ�һ���Ż�˵ '���� -- ��ͨ����',����� <ָ���ʵ��������.java>��
	 8 ����<����>�Ǿ�̬��
	 9 ����<����>���췽��
	10 ����<����>��ͨ���� �� ��ͨ����
	11 ����<����>�Ǿ�̬��
	12 ����<����>���췽��
	 * */
}

@SuppressWarnings("unused")
class ���� {
	public static int a = m1();//�˴���ֱ�ӵ��þ�̬����, �ɴ��Ҳ����ܽ�����˵�Ľ���
	public int b = m2();// ������ͨ����

	static {
		System.out.println("����  -- ��̬��ʼ���� + ��̬���� a = " + a);
	}
	
	{
		System.out.println("����  -- �Ǿ�̬��ʼ����");
	}

	public ����() {
		System.out.println("����  -- ���췽��");
	}

	public static int m1() {
		System.out.println("����  -- ��̬����");
		return 11;
	}

	public int m2(){
		System.out.println("����  -- ��ͨ����");
		return 10;
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("����  -- ����");
	}
	
	public static void main(String[] args) {
		���� f = new ����();
	}
}

class ���� extends ���� {
	
	public static int a = m1();
	public int b = m2();

	static {
		System.out.println("����  -- ��̬��ʼ���� + ��̬���� a = " + a);
	}
	
	{
		System.out.println("����  -- �Ǿ�̬��ʼ����");
	}

	public ����() {
		System.out.println("����  -- ���췽��");
	}

	public static int m1() {
		System.out.println("����  -- ��̬���� ");
		return 88;
	}

	public int m2(){
		System.out.println("����  -- ��ͨ����");
		return 77;
	}
	
	
	public static void main(String[] args) {
//		System.out.println("����ʵ����");
//		���� f = new ����();
		System.out.println("����ʵ����");
		���� z = new ����();
		try {
			z.finalize();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
    
}