package 字符串处理;

public class 字符串处理 {

	/**
	 * 字符串的非空校验要优先判断字符串是否=null
	 * 
	 * */
	
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String str = "   we are students ha 1 ha 2 ha 3 ha 4  ";
		
		System.out.println(str.length());
		
		//去除字符串 左右空格
		System.out.println(str.trim());
		
		//去除字符串 所有空格
		System.out.println(str.replaceAll(" ", ""));
		
		//替换所有重复的字符
		System.out.println(str.replace("ha", "@"));
		
		//替换第一次重复出现的字符
		System.out.println(str.replaceFirst("ha", "@"));
		
		//替换第二次重复出现的字符                          简单实现
		String str2 = str.substring(0, str.indexOf("ha") + 2);
		String str3 = str.substring(str.indexOf("ha") + 2);
		str2 += str3.replaceFirst("ha", "@");
		System.out.println(str2);
				
		//替换最后一次重复出现的字符
		StringBuffer sb2 = new StringBuffer(str);
		System.out.println(sb2.replace(sb2.lastIndexOf("ha"), sb2.lastIndexOf("ha") + 2, "@"));// 从start位，到end位替换为 !
		
		
		/**
		 * 字符串比较
		 * */
		String a = "ChaoJiDaShaBi";
		String b = new String("ChaoJiDaShaBi");
		String c = new String("ChaoJiDaShaBi");
		String d = new String("chaojidashabi");
		String e = b;
		
		// 比较字符串 ， 不区分大小写
		System.out.println(a.equalsIgnoreCase("chaojidashabi"));// true
		
		System.out.println(a == "ChaoJiDaShaBi");// true 原因：因为 a 指向的只是一串 ChaoJiDaShaBi 的字符对象
		System.out.println(b == "ChaoJiDaShaBi");// false 原因：因为 b 指向的是一个字符串对象，该对象存在与内存中，==比较的是内存中的存放地址
		System.out.println(b == c);// false 同上 ,两个new String 存放内存地址不同。 求证： 可以创建两个Studen类，给相同的属性。在用syso直接打印这两个对象，这样能看到他们的内存地址实际上是不一样的
		System.out.println(b.equals(c));// true  equals方法比较两个数据值是否相等
		System.out.println(b == e);// true e 指向的是 b 所 new的对象存放地址
		
		
		/**
		 * 判断字符串的开始与结尾是否以指定内容
		 * */
		String se = "thc wbsc.lls-snapshot";
		// 开始
		System.out.println(se.startsWith("thc "));
		// 结尾
		System.out.println(se.endsWith("-snapshot"));
		
		
		/**
		 * 大小写转换
		 * */
		String dxx = "HA shabi";
		// 全部转换成大写
		System.out.println(dxx.toUpperCase());
		// 全部转换成小写
		System.out.println(dxx.toLowerCase());
		
		
		/**
		 * 字符串分割
		 * */
		String fg = "a,b,c,d,e,f,g";
		String fgArray[] = fg.split(",");
		for (String fgarr : fgArray) {
			System.out.println(fgarr);
		}
		
		//分割成3份
		String fgArray2[] = fg.split(",", 3);
		for (String fgarr : fgArray2) {
			System.out.println(fgarr);
		}
		
		/**
		 * 字符串格式化，详情见百度，太多了！
		 * 1.将金额格式化成中文大写，100
		 * 2.将时间格式化
		 * 3.将数字格式华成货币格式
		 * */
	}
}
