package 语言基础;

public class 修饰符与关键字 {

	/**
	 * 
	 * 修饰符
	 * 
	 * 1、类 class
	 * 	public 所有类中可见
	 * 	缺省——就是没有修饰符，在同一个包的类中可见，其他包中不可见
	 * 2、变量 variable
	 * 	JAVA变量有两种，方法变量和类变量
	 *  方法变量只能用一个修饰符 final
	 * 	final 表示常量，不能修改
	 * 	static 静态变量
	 * 	public 任何类中可见
	 * 	protected 在子类或同包可见
	 * 	private 在本类中可见
	 * 	缺省 —— 在同包可见，子类不同包也不可见
	 * 	final 常量，定义后不能更改值
	 * 	  特殊关键字~~~
	 * 		*transient 告诉编译器，在类对象序列化的时候，此变量不需要持久保存
	 * 		*volatile 指出可能有多个线程修改此变量，要求编译器优化以保证对变量的修改能够被正确的处理
	 * 3、方法 method
	 * 	publiuc 所有类可见
	 *  protected 子类，同包可见
	 * 	private 本类中可见
	 *  缺省 —— 同包可见，子类不同包也不可见
	 *  static 静态方法
	 *  final 方法不可以被重写
	 *  abstract 抽象方法, 有抽象方法的类就是抽象类， 在抽象类中不能实现抽象方法
	 *  native 本地方法，参见 Java Native Interface(JNI)
	 *  synchronized 在多线程中，synchronized方法调用时，其他所有方法不能调用该方法
	 * 3、接口
	 * 	public 所有类可见
	 * 	缺省 —— 同一个包中可见
	 * 	接口中的变量总是需要定义为“public static final 返回值 接口名称”，
	 * 	但可以不包涵这些修饰符，默认就是这样
	 * 
	 * 	接口中的方法只能使用public 和 abstract
	 *
	 * 	
	 * 
	 * 
	 * 关键字
	 * 
	 * continue;
	 * 	中止当前循环继续下次循环，假设有多个循环嵌套，continue只是中止当前循环本次执行，继续当前循环的下次循环
	 * break;
	 * 	结束当前循环的整个循环,假设有多个循环嵌套，break会结束当前循环的整个循环过程
	 * return;
	 * 	返回整个方法
	 * final
	 * 	类不可以继承，方法不可以重写，变量不可以改变
	 * finally
	 * 	异常处理语句中的一部分，表示总是执行
	 * finalize
	 *  是Oject类的一个方法，在垃圾回收执行的时候会调用被回收对象的此方法，可以覆盖此方法提供垃圾收集时的其他资源回收，例如关闭文件等
	 * 
	 * */
	
	
	public static void main(String[] args) {
		/*
		 * break 与 continue 内容补充
		 */
		// continue , 当j = 2时，中止当前循环，并跳入tag 为 no1 的for循环中，继续这个循环。
		// 结果，输出5次1，当内循环判断为j=2时则中止，继续外循环，外循环又需要进入内循环，再次判断j=2。 共执行5此
		no1: for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j == 2) {
					continue no1;
				}
				System.out.println(j);
			}
			System.out.println("---------------------------");
		}
		System.out.println("分割线-----");
		// 结果，输出1次1，在内循环内判断j=2时结束外循环。
		no2: for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j == 2) {
					break no2;
				}
				System.out.println(j);
			}
			System.out.println("---------------------------");
		}
		System.out.println("~~");
	}
}
