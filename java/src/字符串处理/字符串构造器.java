package 字符串处理;

public class 字符串构造器 {
	/**
	 * 字符串构造器 StringBuilder
	 * String 字符串
	 * Builder 建造，建造者
	 * */
	
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		
		// insert 插入
		builder.append("int");
		builder.insert(2, "ser");
		System.out.println("==" + builder);
		
		// delete 删除
		builder.delete(0, builder.length());
		System.out.println("==" + builder);
		
	}
	

}
