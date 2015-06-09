package 字符串处理;

public class 字符串转码Unicode {

	public static void main(String[] args) {
		String str = "大傻gua";
		将中文和字母转成Unicode码(str);
		
		//由 unicode 转码到 中文
		String s = "22823";// unicode 码
		int i = Integer.parseInt(s);// 先转型int
		char c = (char) i;// 再转型char
		System.out.println(c);// char自动转换unicode码
	}
	
	
	public static void 将中文和字母转成Unicode码(String str){
		char charArr[] = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (char cr : charArr) {
			sb.append(((int)cr + "") + " ");// 把单个char转成String类型，再强制转成int类型。这样就获得了Unicode码
		}
		System.out.println("'" + str + "' to Unicode is : " + sb);
		
		
		// 反转码
		StringBuilder sb2 = new StringBuilder();
		String unicodeArr[] = sb.toString().split(" ");
		for (int i = 0; i < unicodeArr.length; i++) {
			char toString = (char) Integer.parseInt(unicodeArr[i]);
			sb2.append(toString);
		}
		
		System.out.println("'" + sb + "' to String is : " + sb2);
		
	}
}
