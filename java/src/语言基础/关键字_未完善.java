package ���Ի���;

public class �ؼ���_δ���� {

	/**
	 * continue;
	 * 	��ֹ��ǰѭ�������´�ѭ���������ж��ѭ��Ƕ�ף�continueֻ����ֹ��ǰѭ������ִ�У�������ǰѭ�����´�ѭ��
	 * break;
	 * 	������ǰѭ��������ѭ��,�����ж��ѭ��Ƕ�ף�break�������ǰѭ��������ѭ������
	 * return;
	 * 	������������
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	
	public static void main(String[] args) {
		/*
		 * break �� continue ���ݲ���
		 */
		// continue , ��j = 2ʱ����ֹ��ǰѭ����������tag Ϊ no1 ��forѭ���У��������ѭ����
		// ��������5��1������ѭ���ж�Ϊj=2ʱ����ֹ��������ѭ������ѭ������Ҫ������ѭ�����ٴ��ж�j=2�� ��ִ��5��
		no1: for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j == 2) {
					continue no1;
				}
				System.out.println(j);
			}
			System.out.println("---------------------------");
		}
		System.out.println("�ָ���-----");
		// ��������1��1������ѭ�����ж�j=2ʱ������ѭ����
		no2: for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j == 2) {
					break no2;
				}
				System.out.println(j);
			}
			System.out.println("---------------------------");
		}
		System.out.println("~~");
	}
}
