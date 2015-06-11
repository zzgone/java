package 接口抽象类;

public interface 父接口 {
	/**
	 * 接口不能实例化，如果要实例化，接口变量必须指向实现所有接口方法的类对象
	 * 接口要被类实现
	 * 接口只能做方法申明
	 * 接口里定义的变量只能是公共的静态的常量
	 * 一个实现接口的类，如不能全部实现接口方法，那么该类也只能为抽象类
	 * 接口可继承接口，并可多继承接口，但类只能单根继承
	 * */
	
	/*
	 * 变量部分
	 * */
	public static final String name = "老子";
	
	// 接口中默认的成员变量默认修饰符为 public static final
	int age = 100;
	
	StringBuffer like = new StringBuffer("吃饭睡觉打豆豆");
	
	/*
	 * 方法部分
	 * */
	String getName();
	
	// 方法默认修饰符为 public abstract 也只能为这两个修饰符
	public abstract int getAge();
}


