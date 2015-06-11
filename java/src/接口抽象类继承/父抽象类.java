package 接口抽象类继承;

public abstract class 父抽象类 {

	/**
	 * 抽象类不能被实例化，如果要实例化，抽象类变量必须指向实现所有抽象方法的子类对象
	 * 抽象类要被子类继承
	 * 抽象类可以做方法声明，也可以做方法实现
	 * 抽象类中的变量可以是普通变量，静态变量，常量
	 * 抽象方法只能声明，不可以实现 abstract void abc(); 不能写成 abstract void abc(){};
	 * 抽象类里可以没有抽象方法
	 * 如果一个类里有抽象方法，那这个类只能是抽象类
	 * 抽象方法要被时间，所以不能是静态的，也不能是私有的。
	 * */
	
	String name;
	@SuppressWarnings("unused")
	private String color;
	protected String bgcolor;
	public String background;
	
	public static int age;
	public static final int money = 999999999;
	
	private void getBackground(){
		
	}
	
	void getColor(){
		
	}
	
	protected void getName(){
		
	}
	
	public static void getBgcolor(){
		
	}
	
	// 抽象方法  只能这样修饰
	public abstract int getAge();
	
}
