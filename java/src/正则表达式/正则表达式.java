package 正则表达式;

import java.util.regex.Pattern;

public class 正则表达式 {

	/**
	 * 方括号中元字符的含义
	 * [a,b,c] = [abc]  表示a、b、或者c  貌似只能判断单个字符 比如[az,bz,cz]等无法识别，只认为是a,b,c,z
	 * [^abc]			表示a、b、和c 以外的任意字符
	 * [a-zA-z0-9]		表示a~z 或  A~Z 和 0-9的任何字符
	 * [a-d[m-p]]		a~d 或 m~p 的任何字符
	 * [a-z&&[def]]		d、e 或者 f
	 * [a-z&&[^bc]]		a~z之间不含b 和 c的所有字符
	 * [a-z&&[^m-p]]	a~z之间不含m~p的所有字符
	 * 
	 * 限定符 
	 * ?				重复 0 次或 1 次			
	 * *				重复 0 次或多次
	 * +				重复 1 次或多次
	 * {n}				限定出现多少次
	 * {n,}				至少出现多少次
	 * {n,m}			限定出现n~m次
	 * 
	 * 元字符
	 * .				代表任意一个字符
	 * \\d				代表0-9的任何一个数字
	 * \\D				代表任何一个非数字字符
	 * \\s				代表空白字符，如转义序列中'\t','\n'
	 * \\S				代表非空白字符
	 * \\w				代表可用作标识符的字符，但不包括 '$'
	 * \\W				代表不可用于标识符的字符
	 * \\p{Lower}		代表小写字母
	 * \\p{upper}		代表大写字母
	 * \\p{ASCII}		ASCII字符
	 * \\p{Alpha]		字母字符
	 * \\p{Dight}		十进制数字，即：[0-9]
	 * \\p{Alnum}		数字或者字符字符
	 * \\p{Punct}		标点符号 !@#$%^&*().<>?:"{}| ....
	 * \\p{Graph}		可见字符 [\p{Alnum}\p{Punct}]
	 * \\p{Print}		可打印字符[\p{Graph}\x20]
	 * \\p{Blank}		空格或制表符[\t]
	 * \\p{Cntrl}		控制字符：[\x00-\x1F\x7F]
	 * 
	 * 匹配字符串字符
	 * ^				匹配输入字符串的开始位置。如果设置了 RegExp 对象的 Multiline 属性，^ 也匹配 '\n' 或 '\r' 之后的位置。
	 * $				匹配输入字符串的结束位置。如果设置了 RegExp 对象的 Multiline 属性，$ 也匹配 '\n' 或 '\r' 之前的位置。
	 * */
	
	public static void main(String[] args) {
		String a = "9";
		检查字符(a);
		
		String handset = "13761449657";
		检查手机号(handset);
		
		String ip = "255.0.255.0";
		检查IP地址(ip);

		String chinese = "超级大笨蛋 super idiot!";
		检查中文字数(chinese);
		检查英文字母(chinese);
		检查英文字母简单版(chinese);
		
		String mail = "305420573@qq.com";
		检查邮箱(mail);
	}
	
	public static void 检查邮箱(String mail){
//		String regex = "\\w{1,}\\@\\w{1,}\\.{1}\\w{1,}";// 有bug
		String regex = "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
		boolean result = Pattern.matches(regex, mail);
		if(result){
			System.out.println("邮箱验证成功");
		}else{
			System.out.println("邮箱不合法");
		}
	}
	
	public static void 检查中文字数(String chinese){
		int amount = 0;
		for (int i = 0; i < chinese.length(); i++) {
			boolean result = Pattern.matches("^[\u4E00-\u9FA5]{0,}$", chinese.charAt(i) + "");
			if(result){// if,只有条件为true时才会执行，result如果为true那么就会执行了
				amount ++;
			}
		}
		System.out.println("中文数" + amount);
	}
	
	public static void 检查英文字母(String english){
		int amount = 0;
		for (int i = 0; i < english.length(); i++) {
			/*
			 * ^$ 					略过
			 * [^]					--> 方括号中的^ 代表 非
			 * [\u4E00-\u9FA5]		--> 表示中文编码
			 * [&&[a-z]]			--> 表示，在什么什么内容中，内容为a-z的
			 * {0,}					--> 至少出现0次
			 * */
			boolean result = Pattern.matches("^[^\u4E00-\u9FA5&&[a-z]]{0,}$", english.charAt(i) + "");
			if(result){//
				amount ++;
			}
		}
		System.out.println("英文字母数" + amount);
	}
	
	public static void 检查英文字母简单版(String english){
		int amount = 0;
		for (int i = 0; i < english.length(); i++) {
			boolean result = Pattern.matches("^[a-z]$", english.charAt(i) + "");
			if(result){//
				amount ++;
			}
		}
		System.out.println("英文字母数简单版" + amount);
	}
	
	public static void 检查手机号(String handset){
		String regex = "1[0-9]\\d{9}$";
		if(handset.matches(regex)){
			System.out.println("手机是合法的");
		}
		else{
			System.out.println("手机号码不合法");
		}
	}
	
	public static void 检查字符(String str){
		String regex = "\\d?";
		if(str.matches(regex)){
			System.out.println("true");
		}else{
			System.out.println("错");
		}
	}

	// ip由 4组有规则数字组成 127.0.0.1
	public static void 检查IP地址(String ip){
		/**
		 * 第一组ip类型有:
		 * 199. 249. 255. 99. 9.
		 * ip前三位不能以0开头
		 * */
		/*
		 * 第一组表达式解析
		 * ^			--> 匹配字符串表达式 开始的位置
		 * 1\\d{2}  	--> 1开头 + 2位数字							demo:199
		 * | 			--> 或者
		 * 2[0-4]\\d 	--> 2开头 + 第二位0-4任意数字 + 任意一位数字		demo:249
		 * | 			-->或者
		 * 25[0-5]		--> 25开头 + 任意一位0-5的数字					demo:255
		 * | 			-->或者
		 * [1-9]\\d		--> 1-9任意一位数字 + 任意一位数字				demo:99
		 * | 			-->或者
		 * [1-9]		--> 1-9任意一位数字							demo:9
		 * ()\\.		--> 把前三位ip括起来，优先校验括号中的表达式，这样也避免了每一组表达式都加上\\. (\\.为小数点)
		 * */
		String regex1 = "^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[1-9])\\.";// 第一组
		/*
		 * 第二组表达式解析
		 * 前面与第一组一致，最后\\d代表任意一位0-6的数字，ip规则中，第二组ip数字可以从0-255任意数字
		 * 但不支持 01 02 03 001 002 033... (这种ip是不合法的)
		 * 支持 255.0. 	255.1	255.2	255.10
		 * */
		String regex2 = "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.";// 第二组
		/*
		 * 第三组规则与第二组一致
		 * */
		String regex3 = "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.";// 第三组
		/*
		 * 第四组表达式与第三组一致，但没有小数点
		 * $ 			--> 代表匹配字符串在这结束,不再往下匹配
		 * */
		String regex4 = "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$";// 第四组
		
		String regex = regex1 + regex2 + regex3 + regex4;
		if(ip.matches(regex)){
			System.out.println("IP验证通过");
		}else{
			System.out.println("IP验证失败");
		}
	}
}
