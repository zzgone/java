package ��������_δ����;


public class ��λ��������ʵ�ֱ���ֵ���� {
	public static void main(String[] args) {

		// ��׼
		long a = 100;
		long b = 200;
		a = a ^ b;// a = 172
		b = b ^ a;// b = b ^ 172
		a = a ^ b;// a = 172 ^ b
		
		System.out.println(a);
		System.out.println(b);
		System.out.println();
		
		
		// С����
		// ���軥��ֵ�ĵڶ���Ϊ:985 ^ 64 = 921
		// ��ôa = 921; b = 985;
		System.out.println("������  985 ^ 64  ���Ϊ��" +  (985 ^ 64));// 921
		
		
		long x = 921;
		long y = 985;
		x = x ^ y;// x = 64.
		y = y ^ x;// y = 921 ,����С����������Ľ��,64���ֵҲ������
		x = x ^ y;// x = 985 ,�����ɹ�
		System.out.println(x);
		System.out.println(y);
	}
	
}
