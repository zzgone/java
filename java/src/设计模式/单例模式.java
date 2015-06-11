package 设计模式;

public class 单例模式 {

}

/**
 * 线程安全，但效率比较低，一开始就要加载类new 一个对象
 * 
 * 饿汉式
 * */
 class SingletonEHan{
	 private SingletonEHan(){
		 // step 1
	 }
	 
	 // step 2 : 类一开始就初始化一个实例，并设置final
	 private static final SingletonEHan instance = new SingletonEHan();
	 
	 // step 3 : 永远只返回初始化时的实例
	 public static SingletonEHan getInstance(){
		 return instance;
	 }
	 
 }
 
 
/**
 * 多个线程访问时就不是线程安全的，返回的不是同一个对象
 * 
 * 饱汉式
 * */
class SingletonBHan{
	
	// step2: 私有化一个当前类的静态变量，初始值 null
	private static SingletonBHan instance = null;
	
	private SingletonBHan(){
		// step1: 私有化构造，让当前实例无法通过 new Singleton() 创建。
	}
	
	// step3: 获取实例，instance 初始值为 null，所以第一次getInstance时必然会new 一个实例对象
	//而程序是修改的instance的值，再下一次getInstance时, instance值已不为null，所以 继续返回原有的 instance对象
	public static SingletonBHan getInstance(){
		if(instance == null){
			instance = new SingletonBHan();
		}
		return instance;
	}
	
	// step4: 验证是否是单例
	public void testInstance(){
		if(instance == null){
			System.out.println("instance is null");
		}else {
			System.out.println("instance is not null");
		}
	}
}

/**
 * 线程安全 但是效率非常低，在一个时候只有一个线程能访问，同时返回一个对象
 * 
 * 饱汉式 线程安全
 * */
class SingletonBHanSynchronized{
	private SingletonBHanSynchronized(){
		// step 1
	}
	
	private static SingletonBHanSynchronized instance;
	// 和饱汉式区别只是加个 synchronized
	public static synchronized SingletonBHanSynchronized getInstance(){
		if(instance == null){
			instance = new SingletonBHanSynchronized();
		}
		return instance;
	}
}

/**
 * 线程安全，并且效率高，支持多线程
 * 
 * */
class SingletonSynchronized{
	private SingletonSynchronized(){
		// step 1
	}
	
	// setp 2
	private static SingletonSynchronized instance;
	
	public static SingletonSynchronized getInstance(){
		// step 3
		if(instance == null){
			// step 4
			synchronized(SingletonSynchronized.class){
				if(instance == null){
					instance = new SingletonSynchronized();
				}
			}
		}
		return instance;
	}
}