package com.zzg.�ַ���;

public class �ַ������ܶԱ� {

	/**
	 * ʹ�ò���
	 * ��1������ԭ�����Ҫ�������������ݣ���String �����̲߳����������ݣ���StringBuilder �����̲߳����������ݣ���StringBuffer��
	 * ��2����Ҫʹ��String���"+"������Ƶ����ƴ�ӣ���Ϊ���������ܼ���ģ�Ӧ��ʹ��StringBuffer��StringBuilder�࣬����Java���Ż�����һ���Ƚ���Ҫ��ԭ��
	 * ��3��Ϊ�˻�ø��õ����ܣ��ڹ��� StirngBuffer �� StirngBuilder ʱӦ������ָ�����ǵ���������Ȼ�������������ַ������ȣ�length�������� 16 ���ַ��Ͳ����ˣ�
	 * 		����ָ��������capacity��ʱĬ�Ϲ���һ������Ϊ16�Ķ��󡣲�ָ�������������������ܡ�
	 * ��4��StringBuilderһ��ʹ���ڷ����ڲ����������"+"���ܣ���Ϊ���̲߳���ȫ�ģ����������Ժ���Զ�����StringBuffer��Ҫ����ȫ�ֱ�����
	 * ��5����ͬ�����ʹ�� StirngBuilder ���ʹ�� StringBuffer ���ܻ�� 10%~15% ���ҵ�������������ȴҪð���̲߳���ȫ�ķ��ա�������ʵ��ģ�黯����У�
	 * 		����ĳһģ��ĳ���Ա��һ�����������жϸ�ģ���Ƿ�������̵߳Ļ��������У���ˣ�����ȷ��ϵͳ��ƿ������ StringBuffer �ϣ�����ȷ�����ģ�鲻�������ڶ��߳�ģʽ�£�
	 * 		�ſ��Բ���StringBuilder����������StringBuffer��
	 * */
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String str = "";
		//ѭ����ʼʱ��
		long starTime = System.currentTimeMillis();
		//ѭ��10��� ... ʮ��νӽ�20�롣 1000W�β�����
//		for (int i = 0; i < 100000; i++) {
//			str = str + i;
//		}
		//ѭ������ʱ��
		long endTime = System.currentTimeMillis();
		long time = endTime - starTime;
		System.out.println("Stringѭ��10W����ʱ" + time + "����");
		
		
		
		StringBuilder builder = new StringBuilder();
		starTime = System.currentTimeMillis();
		for (long i = 0; i < 10000000; i++) {
			builder.append(i);
		}
		endTime = System.currentTimeMillis();
		time = endTime - starTime;
		System.out.println("StringBuilderѭ��1000W����ʱ" + time + "����");
		
		
		StringBuffer buff = new StringBuffer();
		starTime = System.currentTimeMillis();
		for (long i = 0; i < 10000000; i++) {
			buff.append(i);
		}
		endTime = System.currentTimeMillis();
		time = endTime - starTime;
		System.out.println("StringBufferѭ��1000W����ʱ" + time + "����");
	}
	
	
}
