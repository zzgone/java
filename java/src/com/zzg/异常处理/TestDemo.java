package com.zzg.�쳣����;

public class TestDemo {

	public static void main(String[] args) {
		
		try {// ���ԣ���һ�ԡ����Խ������쳣
			String s = "123";
			Integer i = Integer.parseInt(s);
		} catch (Exception e) {// ���񣬵� �쳣�����󣬻���� ������
			
			System.out.println("����ת��Ϊ���֣�����������");
			
//			e.printStackTrace();
			
			
		} finally {// ������ĳ��� �Ƿ����쳣�����ﶼ�ᱻִ��
			
			System.out.println("����ǿ��ִ��");
			
		}
		
		System.out.println("��������");
	}
}
