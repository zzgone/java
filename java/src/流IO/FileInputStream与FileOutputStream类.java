package 流IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStream与FileOutputStream类 {

	/**
	 * FileInputStream与FileOutputTream类都是用来操作磁盘文件的。
	 * 如果用户的文件读取需求比较简单，则可以使用FileInputStream类。
	 * 该类继承自InputStream类。FileOutputStream类与FileInputSream类对应，
	 * 提供了基本的文件写入能力。FileOutputStream类是OutputSteram类的子类。
	 * 
	 * FileInputStream类的常用构造方法如下：
	 * FileInputStream(String name)
	 * FileInputStream(File file)
	 * 
	 * 第一个构造方法使用给定的文件名name创建一个FileInputStream对象。
	 * 第二个构造方法使用File对象创建FileInputStream对象。
	 * 第一个构造方法比较简单，但第二个构造方法允许 在把文件连接输入流之前对文件作进一步处理。
	 * 
	 * FileOutputStream类有与FileInputStream类相同的参数构造方法，
	 * 创建一个FileOutputStream对象时可以指定不存在的文件名，
	 * 但此文件不能是一个已被其他程序打开的文件。
	 * 
	 * 
	 * 下面的实例就是使用FileInputStream与FileOutputStream类实现文件的读取与写入功能
	 * */
	
	
	/**
	 * 使用FileOutputStream类向文件word写入信息，然后通过FileInputStream类将work文件中的数据读取到控制台上。
	 * */
	public static void main(String[] args) {
		File file = new File("e:/testFile","a.txt");//创建文件对象
		try {
			FileOutputStream out = new FileOutputStream(file);//创建FileOutputStream对象
			byte[] text = "死哦noam随便打点字  sadasd  ~".getBytes();
			out.write(text);//将数组中信息写入到文件中
			out.close();//关闭流
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try {
			FileInputStream in = new FileInputStream(file);//创建FileInputStream对象
			byte bt[] = new byte[1024];//创建byte数组
			int len = in.read(bt);//从文件中读取信息
			System.out.println(new String(bt, 0 ,len));
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
