package ��IO;

import java.io.File;

public class File�ļ��Ĵ�����ɾ�� {

	public static void main(String[] args) {
		// 3�ֻ�ȡ�ļ��ķ�ʽ
		
//		File f1 = new File("E:\testFile\test1.txt");
		
//		File f2 = new File("E:\testFile", "test2.txt");
		
//		File f3 = new File(f1, "test3.txt");
		
		�����ļ�();
	}

	/**
	 * ���Ŀ¼�в����ڴ��ļ����򴴽���������ڣ���delete()���ٴ��� 
	 * */
	public static void �����ļ�(){
		File file = new File("e:/testFile","a.txt");
		if(file.exists()){// �ļ��Ƿ���� return boolean
			file.delete();// ɾ���ļ�
			try {
				file.createNewFile();//�����ļ�
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			try {
				file.createNewFile();//�����ļ�
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
