package ���Ի���;

public class Switch��ʾ {
	/*
	 * jdk 1.5�����°汾��֧�� String ��Ϊ����
	 * */
	
	public static void main(String[] args) {
		String str = "ee";
		
		switch (str) {
		case "aa":
			System.out.println("~~");
			break;
		case "bb":
		case "cc":
			System.out.println("..");
			break;
		default:
			System.out.println("!!");
			break;
		}
		
		
		//�൱��
		
		if(str.equals("aa")){
			System.out.println("~~");
		}else if(str.equals("bb") || str.equals("cc")){
			System.out.println("..");
		}else {
			System.out.println("!!");
		}
		
	}

}
