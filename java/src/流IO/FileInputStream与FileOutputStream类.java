package ��IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStream��FileOutputStream�� {

	/**
	 * FileInputStream��FileOutputTream�඼���������������ļ��ġ�
	 * ����û����ļ���ȡ����Ƚϼ򵥣������ʹ��FileInputStream�ࡣ
	 * ����̳���InputStream�ࡣFileOutputStream����FileInputSream���Ӧ��
	 * �ṩ�˻������ļ�д��������FileOutputStream����OutputSteram������ࡣ
	 * 
	 * FileInputStream��ĳ��ù��췽�����£�
	 * FileInputStream(String name)
	 * FileInputStream(File file)
	 * 
	 * ��һ�����췽��ʹ�ø������ļ���name����һ��FileInputStream����
	 * �ڶ������췽��ʹ��File���󴴽�FileInputStream����
	 * ��һ�����췽���Ƚϼ򵥣����ڶ������췽������ �ڰ��ļ�����������֮ǰ���ļ�����һ������
	 * 
	 * FileOutputStream������FileInputStream����ͬ�Ĳ������췽����
	 * ����һ��FileOutputStream����ʱ����ָ�������ڵ��ļ�����
	 * �����ļ�������һ���ѱ���������򿪵��ļ���
	 * 
	 * 
	 * �����ʵ������ʹ��FileInputStream��FileOutputStream��ʵ���ļ��Ķ�ȡ��д�빦��
	 * */
	
	
	/**
	 * ʹ��FileOutputStream�����ļ�wordд����Ϣ��Ȼ��ͨ��FileInputStream�ཫwork�ļ��е����ݶ�ȡ������̨�ϡ�
	 * */
	public static void main(String[] args) {
		File file = new File("e:/testFile","a.txt");//�����ļ�����
		try {
			FileOutputStream out = new FileOutputStream(file);//����FileOutputStream����
			byte[] text = "��Ŷnoam�������  sadasd  ~".getBytes();
			out.write(text);//����������Ϣд�뵽�ļ���
			out.close();//�ر���
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try {
			FileInputStream in = new FileInputStream(file);//����FileInputStream����
			byte bt[] = new byte[1024];//����byte����
			int len = in.read(bt);//���ļ��ж�ȡ��Ϣ
			System.out.println(new String(bt, 0 ,len));
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
