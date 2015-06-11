package 基本特性;

public class JAVA变量声明与赋值 {

}

class Test1 {  // 最正常的例子 输出肯定是 5 10 99
	public static int a;
	public static int b;
	public static int c;
	
	static {
		a = 5;
		b = 10;
		c = 99;
	}
	
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}

class Test2 { // 变量 a 已经初始化一个值,输出 5, 按类的加载顺序，静态块 比 静态变量 后加载，所以a = 5, 被重定义
	public static int a = 50;
	public static int b;
	public static int c;
	
	static {
		a = 5;
		b = 10;
		c = 99;
	}
	
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}

class Test3 { // 此处, 静态变量 c 定义在静态块之后, 但输出依然是99
	public static int a;
	public static int b;
	
	static {
		a = 5;
		b = 10;
		c = 99;
	}
	
	public static int c;
	
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}

class Test4 { 
	// 静态变量c已经初始化了一个值, 按类的加载顺序, c 应该 = 99, 但实际 c = 66666, 说明, java中 变量的 <声明> 与 <赋值> 其实是分开的
	// 相当于 1 声明一个变量 c, 2 指向一个为 99 的内容 给c, 3 因 c共指向2次,jvm取最后一次赋值,所以这时 c = 66666
	// 此处已绕晕！但简单来说，就是声明了一个变量，然后取最后一次赋值，再指向变量。！@#%……￥%……#@￥￥……@
	public static int a = 50;
	public static int b;
	
	static {
		a = 5;
		b = 10;
		c = 99;
	}
	
	public static int c = 66666;
	
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
