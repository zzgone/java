package �ַ�������;

public class �ַ���ת��Unicode {

	public static void main(String[] args) {
		String str = "��ɵgua";
		�����ĺ���ĸת��Unicode��(str);
		
		//�� unicode ת�뵽 ����
		String s = "22823";// unicode ��
		int i = Integer.parseInt(s);// ��ת��int
		char c = (char) i;// ��ת��char
		System.out.println(c);// char�Զ�ת��unicode��
	}
	
	
	public static void �����ĺ���ĸת��Unicode��(String str){
		char charArr[] = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (char cr : charArr) {
			sb.append(((int)cr + "") + " ");// �ѵ���charת��String���ͣ���ǿ��ת��int���͡������ͻ����Unicode��
		}
		System.out.println("'" + str + "' to Unicode is : " + sb);
		
		
		// ��ת��
		StringBuilder sb2 = new StringBuilder();
		String unicodeArr[] = sb.toString().split(" ");
		for (int i = 0; i < unicodeArr.length; i++) {
			char toString = (char) Integer.parseInt(unicodeArr[i]);
			sb2.append(toString);
		}
		
		System.out.println("'" + sb + "' to String is : " + sb2);
		
	}
}
