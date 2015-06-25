package 流IO;

public class 输出流 {

	/**
	 * OutputSream类是字节输入流的抽象类，此抽象类表示输出字节流的所有类的超类。
	 * OutputStream类的具体层次：
	 * 
	 * 父类：
	 * OutputStream
	 * 
	 * 子类：
	 * ByteArrayOutputStream
	 * FileOutputStream
	 * FilterOutputStream
	 * 		子类：
	 * 		BufferedOutputStream
	 * 		DataOutputStream
	 * 		...
	 * ObjectOutputStream
	 * OutputStream
	 * 		子类：
	 * 		OutputStream
	 * PipadOutputStream
	 * 
	 * 常用方法
	 * write(int b);						将指定的字节写入此输出流
	 * write(byte[] b);						将b.length个字节从指定的byte数组写入此输出流
	 * write(byte[] b,int off,int len);		将指定byte数组中从偏移量off开始的len个字节写入此输出流
	 * flush();								彻底完成输出并清空缓存区
	 * close();								关闭输出流
	 * 
	 * 
	 * Writer类是字符输出流的抽象类，所有字符输出类的实现都是他的子类。
	 * Writer类的层次结构：
	 * 
	 * 父类：
	 * Writer
	 * 
	 * 子类：
	 * BufferedWriter
	 * CharArrayWriter
	 * FilterWriter
	 * 		子类：	
	 * 		FileWriter
	 * OutputStreamWriter
	 * PipedWriter
	 * PrintWriter
	 * StringWriter
	 * 
	 * 
	 * */
}
