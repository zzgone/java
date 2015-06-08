package 语言基础;

public class Switch演示 {
	/*
	 * jdk 1.5及以下版本不支持 String 做为参数
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
		
		
		//相当于
		
		if(str.equals("aa")){
			System.out.println("~~");
		}else if(str.equals("bb") || str.equals("cc")){
			System.out.println("..");
		}else {
			System.out.println("!!");
		}
		
	}

}
