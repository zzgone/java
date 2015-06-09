package 杂乱问题_未整理;

public class 指向的实例化对象{
	
	/**
	 * 继承 构建子类对象 构建父类构造方法时  引发的有趣的问题
	 * */
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		sub s = new sub();// 1 构建子类对象
		
		// 父类 引用 子类实例化对象  调用的是子类中定义的属性，符合3点条件
		base b = new sub();
		
		
		// 3 综述 
		// display与getclass方法的调用取决于 实例化(new Class, new 出一个对象也称为实例化一个对象 ) 的类是哪一个。
		// 由于是new sub，所以在构建base()的时候自然是实例化sub，所以getClass时自然是得到的sub对象。
	}
}

class base {
	private int i = 22;
	public void display(){
		System.out.println(i);
	}
	
	public base(){
		display();// 2 由于两个类是继承关系，父类有构造方法，所以会先构建父类对象，调用此方法，但子类又重写了此方法，所以调用的实际上是子类的display方法，但此时变量 i 还没有定义值，所以默认为 0
		System.out.println(this.getClass().toString());// 由子类构建的对象，所以getClass是获得子类的class
	}
}

class sub extends base{
	private int i = 100;
//	private Integer i = 100;//integer的默认值是null，定义为包装类型的时候返回为 null class..sub 100;
	@Override
	public void display() {
		System.out.println(i);
	}
	public sub(){
		display();
	}
	 	
}


