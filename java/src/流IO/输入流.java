package 流IO;

public class 输入流 {

	/**
	 * InputStream抽象类是字节输入流的抽象类，是所有字节输入流的父类。
	 * 
	 * InputStream抽象类的具体层次结构：
	 * 
	 * 父类
	 * InputStream
	 * 
	 * 子类
	 * AudioInputStream
	 * ByteArrayInputStream
	 * StringBufferInputStream
	 * FileInputStream
	 * FilterInputStream
	 * 		子类
	 * 		BufferedInputStream
	 * 		DataInputSteam
	 * 		PushbackInputStream
	 * 		...
	 * InputStream
	 * ObjectInputStream
	 * SequenceInputStream
	 * PipedInputStream
	 * 
	 * 该类中所有方法遇到错误都会引发IOException
	 * */
	
	/**
	 * 方法：
	 * 
	 * read();					从输入流中读取数据的下一个字节。返回0-255范围内int字节值。如果因为已经到达流末尾而没有可用的字节，则返回值-1
	 * read(byte[] b);			从输入流中读入一定长度的字节，并以整数的形式返回字节数
	 * mark(int readlimit);		在输入流的当前位置放置一个标记，readlimit参数告知此输入流在标记位置失效之前允许读取的字节数
	 * reset();					将输入指针返回到当前所做的标记处
	 * skip(long n);			跳过输入流上的n个字节并返回实际跳过的字节数
	 * markSupported();			如果当前流支持mark()/reset()操作就返回true
	 * close();					关闭此输入流并释放与该流管理的所有系统资源
	 * 
	 * 
	 * 注意：并不是所有的InputStream类的子类都支持InputStream中定义的所有方法，如skip(),mark(),reset()等，这些方法只对某些子类有用
	 * */
	
	/**
	 * 字符流
	 * java中的字符是Unicode编码，是双字节的。
	 * InputStream是用来处理字节的，在处理字符文本时不是很方便。
	 * Java为字符文本的输入提供了专门一套单独的Reader，但Reader类并不是InputStream类的替换者，
	 * 只是在处理字符串时简化了编程。Reader类是字符输入流的抽象类，所有字符输入流的实现都是他的子类。
	 * Reader类中的方法与InputStream中方法类似，可查看相关JDK文档。
	 * Reader类的具体层次结构：
	 * 
	 * 父类：抽象类
	 * Reader
	 * 
	 * 子类：
	 * CharArrayReader
	 * BufferedReader
	 * 		子类：
	 * 		LineNumberReader
	 * FilterReader
	 * 		子类：
	 * 		PushbackReader
	 * InputStreamReader
	 * 		子类：
	 * 		FileReader
	 * PipedReader
	 * StringReader
	 * */
	
}
