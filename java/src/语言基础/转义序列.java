package 语言基础;

public class 转义序列 {
	
	// java 转义序列
	public static void main(String[] args) {
		// "\b" 退格
		System.out.println("a \b c"); //不知道什么用
		// "\f" 换页
		System.out.println("a \f c"); //不知道什么用
		// "\n" 换行
		System.out.println("a \n c");
		// "\r" 回车
		System.out.println("a \r c"); //实际效果也是换行
		// "\t" 水平定位
		System.out.println("1\t2\t3\t4");
		System.out.println("aaa\tbbb\tccc\tddd");
		// "\'" 单引号
		System.out.println("'a','b','c',\'d\'");
		// "\"" 双引号
		System.out.println("\"a\",\"b\"");
		// "\\" 反斜线
		System.out.println("1" + "\\" + "2");
		// "ddd" 1~3位八进制数据所表示的字符，如\456
		char a8 = '\u1235';// 不知道该怎么表示
		System.out.println(a8);  
		// "dxxxx" 4位十六进制所表示的字符，如\0052
		char a16 = '\u2605';
		System.out.println(a16);
	}
}
