package �ַ�������;

public class �ַ��������� {
	/**
	 * �ַ��������� StringBuilder
	 * String �ַ���
	 * Builder ���죬������
	 * */
	
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		
		// insert ����
		builder.append("int");
		builder.insert(2, "ser");
		System.out.println("==" + builder);
		
		// delete ɾ��
		builder.delete(0, builder.length());
		System.out.println("==" + builder);
		
	}
	

}
