package com.zzg.�쳣����;

public class ExceptionTest {

	/**
	 * Exception �쳣
	 * @throws Exception 
	 * 
	 * */

	public static void main(String[] args) throws Exception {
//		asdasd();
//		asdasdfffff();
//		asdas(null);
		
//		ddd();
	}

	/**
	 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 9 at
	 * com.zzg.�쳣����.ExceptionTest.main(ExceptionTest.java:14)
	 * 
	 * ����쳣����main�������淢���ˡ�
	 * 
	 * ���»��ߵ��� java.lang.Array.................. ��ʾΪ �쳣������
	 * java.lang.ArrayIndexOutOfBoundsException
	 * 
	 * ArrayIndexOutOfBoundsException �����±�Խ���쳣 Array ���� Index �±� Out ��ȥ������ of
	 * ��.. ʲôʲôʲô Bounds ���� Exception �쳣
	 * 
	 * ����ģ�9 ����ʾ�������ߵ���Ϣ
	 * 
	 * */
	public static void asdasd() {
		// �����±�Խ���쳣
		int[] i = new int[3];// ������һ�����飬������3���±��Ӧ�� 0 1 2
		i[9] = 11;
	}
	
	/**
	 * ����ת���쳣
	 * java.lang.NumberFormatException
	 * */
	public static void asdasdfffff() {
		String s = "222dddd";
		
		Integer i = Integer.parseInt(s);
		
	}
	
	/**
	 * ��ָ���쳣
	 * java.lang.NullPointerException
	 * */
	public static void asdas(String a) {
		// ��ܿ�ָ��
		if (a != null && a.equals("abc")) {
			System.out.println("�Ե���abc");
		}
		
		System.out.println("���������");
	}
	
	/**
	 * �׳��쳣���ϼ�(���ø÷����� �ͽ��ϼ�)
	 * */
	public static void ddd() throws Exception {
		Integer i = Integer.parseInt("asdasdasd");
	}
	

}
