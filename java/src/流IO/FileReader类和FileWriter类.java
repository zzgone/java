package ��IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader���FileWriter�� {

	/**
	 * ʹ��FileOutputStream�����ļ���д��������ʹ��FileInputStream����ļ��н����ݶ�������
	 * ����һ�㲻�㣬���������඼ֻ�ṩ�˶��ֽڻ��ֽ�����Ķ�ȡ������
	 * ���ں������ļ���ռ�������ֽڣ����ʹ���ֽ�������ȡ���ÿ��ܻ������������
	 * ��ʱ�����ַ���FileReader��FileWriter�༴�ɱ�����������
	 * 
	 * FileReader��FileWriter�ַ�����Ӧ��FileInputStream��FileOutputStream�ࡣ
	 * FileReader��˳��Ķ�ȡ�ļ���ֻҪ���ر�����ÿ�ε���read()������˳��Ķ�ȡԴ����������ݣ�
	 * ֱ��Դ��ĩβ���������رա�
	 * 
	 * 
	 * ����������FileReader��FileWriter�÷�
	 * */
	
	public static void main(String[] args) {
		File file = new File("E:/testFile/b.txt");
		try {
			FileWriter out = new FileWriter(file);
			String s = "���д��ʲô������b.txt";
			out.write(s);// �˷�ʽ��ɾ��ԭ���ļ��е��������ݣ�Ȼ��д���ַ���s
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
