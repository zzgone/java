package com.zzg.io��;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IOTest {

	public static void main(String[] args) {
		
		asd();
		
	}
	
	/**
	 * ��ȡa.txt�ļ�
	 * */
	public static void asd() {
		
		// ������һ�� �ļ�����
		File file = new File("D:/xxx/a.txt");
		
		// ������
		BufferedReader read =  null; 
		
		try {
			// �ļ�������
			FileReader fileReader = new FileReader(file);
			
			// ������
			read = new BufferedReader(fileReader);
			
			String text = read.readLine();// ��ȡһ��
			
			while (text != null) {// ��ʾ�������� �����Լ�����ȡ
				
				System.out.println(text);
				text = read.readLine();// ��ȡ��һ��
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// �ر���
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
