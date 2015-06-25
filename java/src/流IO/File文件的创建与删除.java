package 流IO;

import java.io.File;

public class File文件的创建与删除 {

	public static void main(String[] args) {
		// 3种获取文件的方式
		
//		File f1 = new File("E:\testFile\test1.txt");
		
//		File f2 = new File("E:\testFile", "test2.txt");
		
//		File f3 = new File(f1, "test3.txt");
		
		创建文件();
	}

	/**
	 * 如果目录中不存在此文件，则创建，如果存在，在delete()后再创建 
	 * */
	public static void 创建文件(){
		File file = new File("e:/testFile","a.txt");
		if(file.exists()){// 文件是否存在 return boolean
			file.delete();// 删除文件
			try {
				file.createNewFile();//创建文件
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			try {
				file.createNewFile();//创建文件
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
