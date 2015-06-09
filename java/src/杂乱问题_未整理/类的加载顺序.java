package 杂乱问题_未整理;

public class 类的加载顺序 {
	/** -- 未继承
	 * -- 类未实例化
	   1 声明静态变量
	   2 加载静态方法
	   3 加载静态代码快
	   
	   -- 类实例化
	   4 声明普通成员变量
	   5 加载普通方法
	   6 加载非静态块
	   7 加载构造方法
	   
	   总结，个人感觉变量与方法要优先于任何块，不然其他块没法引用
	 * */
	
	/** -- 继承
	 -- 未实例化
	 1 声明<父类>静态变量
	 2 加载<父类>静态方法
	 3 加载<父类>静态块
	 
	 4 声明<子类>静态变量
	 5 加载<子类>静态方法
	 6 加载<子类>静态块
	 
	 -- 父类实例化 （如果需要实例化父类的话~）
	 	<父类>  -- 普通变量 及 普通方法
		<父类>  -- 非静态初始化块
		<父类>  -- 构造方法
	 -- 子类实例化 （实例化子类会自动实例化父类，通俗来说，你爸爸还没出生，儿子从哪里来？）
	 7 声明<父类>普通变量 及 普通方法  （子类变量b调用m2方法，由于构造实例化是子类的关系，所以子类实例化的第一步才会说 '子类 -- 普通方法',详情见 <指向的实例化对象.java>）
	 8 加载<父类>非静态块
	 9 加载<父类>构造方法
	10 声明<子类>普通变量 及 普通方法
	11 加载<子类>非静态块
	12 加载<子类>构造方法
	 * */
}

@SuppressWarnings("unused")
class 父类 {
	public static int a = m1();//此处是直接调用静态方法, 由此我才有总结中所说的结论
	public int b = m2();// 调用普通方法

	static {
		System.out.println("父类  -- 静态初始化块 + 静态变量 a = " + a);
	}
	
	{
		System.out.println("父类  -- 非静态初始化块");
	}

	public 父类() {
		System.out.println("父类  -- 构造方法");
	}

	public static int m1() {
		System.out.println("父类  -- 静态方法");
		return 11;
	}

	public int m2(){
		System.out.println("父类  -- 普通方法");
		return 10;
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("销毁  -- 父类");
	}
	
	public static void main(String[] args) {
		父类 f = new 父类();
	}
}

class 子类 extends 父类 {
	
	public static int a = m1();
	public int b = m2();

	static {
		System.out.println("子类  -- 静态初始化块 + 静态变量 a = " + a);
	}
	
	{
		System.out.println("子类  -- 非静态初始化块");
	}

	public 子类() {
		System.out.println("子类  -- 构造方法");
	}

	public static int m1() {
		System.out.println("子类  -- 静态方法 ");
		return 88;
	}

	public int m2(){
		System.out.println("子类  -- 普通方法");
		return 77;
	}
	
	
	public static void main(String[] args) {
//		System.out.println("父类实例化");
//		父类 f = new 父类();
		System.out.println("子类实例化");
		子类 z = new 子类();
		try {
			z.finalize();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
    
}