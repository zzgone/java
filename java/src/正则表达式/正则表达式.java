package ������ʽ;

import java.util.regex.Pattern;

public class ������ʽ {

	/**
	 * ��������Ԫ�ַ��ĺ���
	 * [a,b,c] = [abc]  ��ʾa��b������c  ò��ֻ���жϵ����ַ� ����[az,bz,cz]���޷�ʶ��ֻ��Ϊ��a,b,c,z
	 * [^abc]			��ʾa��b����c ����������ַ�
	 * [a-zA-z0-9]		��ʾa~z ��  A~Z �� 0-9���κ��ַ�
	 * [a-d[m-p]]		a~d �� m~p ���κ��ַ�
	 * [a-z&&[def]]		d��e ���� f
	 * [a-z&&[^bc]]		a~z֮�䲻��b �� c�������ַ�
	 * [a-z&&[^m-p]]	a~z֮�䲻��m~p�������ַ�
	 * 
	 * �޶��� 
	 * ?				�ظ� 0 �λ� 1 ��			
	 * *				�ظ� 0 �λ���
	 * +				�ظ� 1 �λ���
	 * {n}				�޶����ֶ��ٴ�
	 * {n,}				���ٳ��ֶ��ٴ�
	 * {n,m}			�޶�����n~m��
	 * 
	 * Ԫ�ַ�
	 * .				��������һ���ַ�
	 * \\d				����0-9���κ�һ������
	 * \\D				�����κ�һ���������ַ�
	 * \\s				����հ��ַ�����ת��������'\t','\n'
	 * \\S				����ǿհ��ַ�
	 * \\w				�����������ʶ�����ַ����������� '$'
	 * \\W				���������ڱ�ʶ�����ַ�
	 * \\p{Lower}		����Сд��ĸ
	 * \\p{upper}		�����д��ĸ
	 * \\p{ASCII}		ASCII�ַ�
	 * \\p{Alpha]		��ĸ�ַ�
	 * \\p{Dight}		ʮ�������֣�����[0-9]
	 * \\p{Alnum}		���ֻ����ַ��ַ�
	 * \\p{Punct}		������ !@#$%^&*().<>?:"{}| ....
	 * \\p{Graph}		�ɼ��ַ� [\p{Alnum}\p{Punct}]
	 * \\p{Print}		�ɴ�ӡ�ַ�[\p{Graph}\x20]
	 * \\p{Blank}		�ո���Ʊ��[\t]
	 * \\p{Cntrl}		�����ַ���[\x00-\x1F\x7F]
	 * 
	 * ƥ���ַ����ַ�
	 * ^				ƥ�������ַ����Ŀ�ʼλ�á���������� RegExp ����� Multiline ���ԣ�^ Ҳƥ�� '\n' �� '\r' ֮���λ�á�
	 * $				ƥ�������ַ����Ľ���λ�á���������� RegExp ����� Multiline ���ԣ�$ Ҳƥ�� '\n' �� '\r' ֮ǰ��λ�á�
	 * */
	
	public static void main(String[] args) {
		String a = "9";
		����ַ�(a);
		
		String handset = "13761449657";
		����ֻ���(handset);
		
		String ip = "255.0.255.0";
		���IP��ַ(ip);

		String chinese = "�����󱿵� super idiot!";
		�����������(chinese);
		���Ӣ����ĸ(chinese);
		���Ӣ����ĸ�򵥰�(chinese);
		
		String mail = "305420573@qq.com";
		�������(mail);
	}
	
	public static void �������(String mail){
//		String regex = "\\w{1,}\\@\\w{1,}\\.{1}\\w{1,}";// ��bug
		String regex = "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
		boolean result = Pattern.matches(regex, mail);
		if(result){
			System.out.println("������֤�ɹ�");
		}else{
			System.out.println("���䲻�Ϸ�");
		}
	}
	
	public static void �����������(String chinese){
		int amount = 0;
		for (int i = 0; i < chinese.length(); i++) {
			boolean result = Pattern.matches("^[\u4E00-\u9FA5]{0,}$", chinese.charAt(i) + "");
			if(result){// if,ֻ������Ϊtrueʱ�Ż�ִ�У�result���Ϊtrue��ô�ͻ�ִ����
				amount ++;
			}
		}
		System.out.println("������" + amount);
	}
	
	public static void ���Ӣ����ĸ(String english){
		int amount = 0;
		for (int i = 0; i < english.length(); i++) {
			/*
			 * ^$ 					�Թ�
			 * [^]					--> �������е�^ ���� ��
			 * [\u4E00-\u9FA5]		--> ��ʾ���ı���
			 * [&&[a-z]]			--> ��ʾ����ʲôʲô�����У�����Ϊa-z��
			 * {0,}					--> ���ٳ���0��
			 * */
			boolean result = Pattern.matches("^[^\u4E00-\u9FA5&&[a-z]]{0,}$", english.charAt(i) + "");
			if(result){//
				amount ++;
			}
		}
		System.out.println("Ӣ����ĸ��" + amount);
	}
	
	public static void ���Ӣ����ĸ�򵥰�(String english){
		int amount = 0;
		for (int i = 0; i < english.length(); i++) {
			boolean result = Pattern.matches("^[a-z]$", english.charAt(i) + "");
			if(result){//
				amount ++;
			}
		}
		System.out.println("Ӣ����ĸ���򵥰�" + amount);
	}
	
	public static void ����ֻ���(String handset){
		String regex = "1[0-9]\\d{9}$";
		if(handset.matches(regex)){
			System.out.println("�ֻ��ǺϷ���");
		}
		else{
			System.out.println("�ֻ����벻�Ϸ�");
		}
	}
	
	public static void ����ַ�(String str){
		String regex = "\\d?";
		if(str.matches(regex)){
			System.out.println("true");
		}else{
			System.out.println("��");
		}
	}

	// ip�� 4���й���������� 127.0.0.1
	public static void ���IP��ַ(String ip){
		/**
		 * ��һ��ip������:
		 * 199. 249. 255. 99. 9.
		 * ipǰ��λ������0��ͷ
		 * */
		/*
		 * ��һ����ʽ����
		 * ^			--> ƥ���ַ������ʽ ��ʼ��λ��
		 * 1\\d{2}  	--> 1��ͷ + 2λ����							demo:199
		 * | 			--> ����
		 * 2[0-4]\\d 	--> 2��ͷ + �ڶ�λ0-4�������� + ����һλ����		demo:249
		 * | 			-->����
		 * 25[0-5]		--> 25��ͷ + ����һλ0-5������					demo:255
		 * | 			-->����
		 * [1-9]\\d		--> 1-9����һλ���� + ����һλ����				demo:99
		 * | 			-->����
		 * [1-9]		--> 1-9����һλ����							demo:9
		 * ()\\.		--> ��ǰ��λip������������У�������еı��ʽ������Ҳ������ÿһ����ʽ������\\. (\\.ΪС����)
		 * */
		String regex1 = "^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[1-9])\\.";// ��һ��
		/*
		 * �ڶ�����ʽ����
		 * ǰ�����һ��һ�£����\\d��������һλ0-6�����֣�ip�����У��ڶ���ip���ֿ��Դ�0-255��������
		 * ����֧�� 01 02 03 001 002 033... (����ip�ǲ��Ϸ���)
		 * ֧�� 255.0. 	255.1	255.2	255.10
		 * */
		String regex2 = "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.";// �ڶ���
		/*
		 * �����������ڶ���һ��
		 * */
		String regex3 = "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.";// ������
		/*
		 * ��������ʽ�������һ�£���û��С����
		 * $ 			--> ����ƥ���ַ����������,��������ƥ��
		 * */
		String regex4 = "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$";// ������
		
		String regex = regex1 + regex2 + regex3 + regex4;
		if(ip.matches(regex)){
			System.out.println("IP��֤ͨ��");
		}else{
			System.out.println("IP��֤ʧ��");
		}
	}
}
