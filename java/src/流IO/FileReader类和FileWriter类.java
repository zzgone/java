package 流IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader类和FileWriter类 {

	/**
	 * 使用FileOutputStream类向文件中写入数据与使用FileInputStream类从文件中将内容读出来，
	 * 存在一点不足，即这两个类都只提供了对字节或字节数组的读取方法。
	 * 由于汉字在文件中占用两个字节，如果使用字节流，读取不好可能会出现乱码现象。
	 * 此时采用字符流FileReader或FileWriter类即可避免这种现象。
	 * 
	 * FileReader、FileWriter字符流对应了FileInputStream、FileOutputStream类。
	 * FileReader流顺序的读取文件，只要不关闭流，每次调用read()方法就顺序的读取源中其余的内容，
	 * 直到源的末尾或者流被关闭。
	 * 
	 * 
	 * 下面程序介绍FileReader与FileWriter用法
	 * */
	
	public static void main(String[] args) {
		File file = new File("E:/testFile/b.txt");
		try {
			FileWriter out = new FileWriter(file);
			String s = "随便写点什么鬼东西到b.txt";
			out.write(s);// 此方式会删除原本文件中的所有内容，然后写入字符串s
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
