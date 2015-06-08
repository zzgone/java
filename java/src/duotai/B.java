package duotai;

public class B extends A{
	int ai = 0;
	static int t = 88;
	
	//main方法调用线程，最后一步为exit();debug可见
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.show());
		B b = new B();
		System.out.println(b.show());
		
		A a1 = new B();//父类指向子类对象
		System.out.println(a1.show());//拿到b对象的内容
		System.out.println(a1.show2());
		System.out.println(a1.ai);// A 
		System.out.println(t);// B
		/*
		 * 父类对象指向子类对象时，只能调用父类对象中已经定义的方法，无法调用子类对象中新增的方法
		 * 当子类没有重写父类方法时，指向子类的父类对象调用的是父类本身的方法
		 * */
		
		//子类无法指向父类对象
//		B b1 = (B) new A();
		
		
	}
	
	@Override
	public int show() {
		return 18;
	}
	
	public int show2(){
		
		return 0;
	}
}
