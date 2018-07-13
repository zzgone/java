package com.zzg.io流;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IOTest {

	public static void main(String[] args) {
		
		asd();
		
	}
	
	/**
	 * 读取a.txt文件
	 * */
	public static void asd() {
		
		// 创建出一个 文件对象
		File file = new File("D:/xxx/a.txt");
		
		// 输入流
		BufferedReader read =  null; 
		
		try {
			// 文件输入流
			FileReader fileReader = new FileReader(file);
			
			// 输入流
			read = new BufferedReader(fileReader);
			
			String text = read.readLine();// 读取一行
			
			while (text != null) {// 表示还有数据 还可以继续读取
				
				System.out.println(text);
				text = read.readLine();// 读取下一行
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 关闭流
			if(read != null) {
				try {
					read.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
