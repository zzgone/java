package ���Ի���;

public class ת������ {
	
	// java ת������
	public static void main(String[] args) {
		// "\b" �˸�
		System.out.println("a \b c"); //��֪��ʲô��
		// "\f" ��ҳ
		System.out.println("a \f c"); //��֪��ʲô��
		// "\n" ����
		System.out.println("a \n c");
		// "\r" �س�
		System.out.println("a \r c"); //ʵ��Ч��Ҳ�ǻ���
		// "\t" ˮƽ��λ
		System.out.println("1\t2\t3\t4");
		System.out.println("aaa\tbbb\tccc\tddd");
		// "\'" ������
		System.out.println("'a','b','c',\'d\'");
		// "\"" ˫����
		System.out.println("\"a\",\"b\"");
		// "\\" ��б��
		System.out.println("1" + "\\" + "2");
		// "ddd" 1~3λ�˽�����������ʾ���ַ�����\456
		char a8 = '\u1235';// ��֪������ô��ʾ
		System.out.println(a8);  
		// "dxxxx" 4λʮ����������ʾ���ַ�����\0052
		char a16 = '\u2605';
		System.out.println(a16);
	}
}
