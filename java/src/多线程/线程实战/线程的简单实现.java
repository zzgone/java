package 多线程.线程实战;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class 线程的简单实现 {

}

/* 线程的实现 */

/**
 * 1.继承Thread类，直接调用run方法
 * */
class ExtThread_1 extends Thread{
	
	private String name;
	
	public ExtThread_1(){
		
	}
	
	public ExtThread_1(String name){
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(name + "运行    " + i);
		}
	}
	
	public static void main(String[] args) {
		ExtThread_1 et1 = new ExtThread_1("A thread");
		ExtThread_1 et2 = new ExtThread_1("B thread");
		et1.start(); // 启动线程用start. 用到cpu资源每次执行结果基本不一样, 线程的运行需要本地操作系统的支持
		et2.start(); // 调用start方法实际上是调用了一个start0的native方法，所以实际上他是需要调用硬件设备的（CPU）
		
	}
}

/**
 * 2.实现Runnable接口
 * */
class ImplRunnable_1 implements Runnable {

	private String name;
	
	public ImplRunnable_1(){
		
	}
	
	public ImplRunnable_1(String name){
		this.name = name;
	}
	
	@Override
	// 接口方法，必须实现
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(name + "运行    " + i);
		}
	}
	
	public static void main(String[] args) {
		ImplRunnable_1 ir1 = new ImplRunnable_1("thread A");
		ImplRunnable_1 ir2 = new ImplRunnable_1("thread B");
		Thread t1 = new Thread(ir1);
		Thread t2 = new Thread(ir2);
		t1.start();
		t2.start();
	}
}


/* 线程之间的资源共享 */

/**
 * 继承Thread类，不能资源共享
 * */
class ExtThread_2 extends Thread {

	private int count =  5;
	private String name;
	
	public ExtThread_2() {
		
	}
	
	public ExtThread_2(String name) {
		this.name = name;
	}
	
	
	@Override
	public void run() {
		for (int i = 0; i < 7; i++) {
			if(count > 0) {
				System.out.println(name + " count = " + count --);
			}
		}
	}
	
	public static void main(String[] args) {
		ExtThread_2 et1 = new ExtThread_2("a");
		ExtThread_2 et2 = new ExtThread_2("b");
		ExtThread_2 et3 = new ExtThread_2("c");
		et1.start();
		et2.start();
		et3.start();
	}
}

/**
 * 实现Runnable接口实现资源共享
 * 实现Runnable接口比继承Thread类所具有的优势：
 * 1).适合多个相同的程序代码的线程去处理同一个资源
 * 2).可以避免java中的单继承的限制
 * 3).增加程序的健壮性，代码可以被多个线程共享，代码和数据独立。
 * */
class ImplRunnable_2 implements Runnable {

	private int ticket = 5;
	
	@Override
	public void run() {
		for (int i = 0; i <= 20; i++) {
			if(this.ticket > 0){
				System.out.println(Thread.currentThread().getName() + "正在售票，" + this.ticket --);
			}
		}
	}
	
	public static void main(String[] args) {
		ImplRunnable_2 r1 = new ImplRunnable_2();
		new Thread(r1, "1号窗口").start();
		new Thread(r1, "2号窗口").start();
		new Thread(r1, "3号窗口").start();
	}
}

/**
 * 取得线程名称
 * */
class getThreadName implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	
	// main方法其实也是一个线程。在java中所以的线程都是同时启动的，至于什么时候，哪个先执行，完全看谁先得到CPU的资源。
	// 在java中，每次程序运行至少启动2个线程。一个是main线程，一个是垃圾收集线程。因为每当使用java命令执行一个类的时候，实际上都会启动一个ＪＶＭ，每一个ｊＶＭ实习在就是在操作系统中启动了一个进程。
	public static void main(String[] args) {
		getThreadName r3 = new getThreadName();
		new Thread(r3, "A").start();
		new Thread(r3, "B").start();
		new Thread(r3).start(); // 说明如果我们没有指定名字的话，系统自动提供名字。
	}
}

/**
 * 判断线程是否启动
 * */
class ThreadIsStart implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) {
		// 主线程也有可能在子线程结束之前结束。并且子线程不受影响，不会因为主线程的结束而结束。
		ThreadIsStart tis = new ThreadIsStart();
		Thread t = new Thread(tis);
		System.out.println("线程启动之前 --->" + t.isAlive());
		t.start();
		System.out.println("线程启动之后 --->" + t.isAlive());
	}
	
}


/**
 * 线程强制执行 - ？？？？？ 有啥用？
 * */
class ThraedCompulsoryExecution implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) {
		ThraedCompulsoryExecution tce = new ThraedCompulsoryExecution();
		Thread t = new Thread(tce);
		t.start();
		
		for (int i = 0; i < 50; i++) {
			//这段if代码有什么意义？？？
			if(i > 40){
				try {
					t.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("main 线程执行 " + i);
		}
	}
	
	
}


/**
 * 线程的休眠
 * */
class ThreadSleep implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(2000);// 进入循环后，到这里将等待2秒，再执行下一段(行)代码
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + i);
		}
	}
	
	public static void main(String[] args) {
		ThreadSleep ts = new ThreadSleep();
		// 多个线程进入run中，也会针对每一个线程等待
		Thread t = new Thread(ts, "Thread");
		Thread t2 = new Thread(ts, "Runnable");
		t.start();
		t2.start();
	}
}

/**
 * 线程的中断
 * */
class ThreadStop implements Runnable {

	@Override
	public void run() {
		System.out.println("执行run方法");
		long startTime = System.currentTimeMillis();
		try {
			Thread.sleep(10000);
			System.out.println("线程完成sleep");
		} catch (Exception e) {
			System.out.println("sleep被中断");
			long endTime = System.currentTimeMillis();
			System.out.println("sleep" + (endTime - startTime));
			return; // 返回到程序的调用处
		}
		System.out.println("线程正常终止");
		long endTime = System.currentTimeMillis();
		System.out.println("sleep" + (endTime - startTime));
	}
	
	public static void main(String[] args) {
		ThreadStop ts = new ThreadStop();
		Thread t = new Thread(ts, "线程[a]");
		t.start();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 注释后正常停止线程
		t.interrupt(); // 2秒后中断线程
	}
}


/**
 * 设置守护线程(后台线程)
 * 在java程序中，只要前台有一个线程在运行，整个java程序进程不会消失
 * 所以此时可以设置一个守护线程，这样即使java进程消失了，此守护线程依然能够继续运行
 * */
class DaemonThread implements Runnable {

	@Override
	public void run() {
		while(true){
			System.out.println(Thread.currentThread().getName() + "正在运行");
		}
	}
	
	public static void main(String[] args) {
		DaemonThread dt = new DaemonThread();
		Thread t = new Thread(dt, "线程[a]");
		System.out.println("start");
		t.setDaemon(true);
		t.start();
	}
}


/**
 * 线程的优先级
 * */
class ThreadPriority implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + "运行" + i);
		}
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadPriority(), "a");
		Thread t2 = new Thread(new ThreadPriority(), "b");
		Thread t3 = new Thread(new ThreadPriority(), "c");
		
		// 虽然设置了线程的优先级，但并不是说优先级越高就先执行，还是取决于谁抢到了CPU资源，但设置优先级，先执行的几率要大些.. 主线程的优先级是5
		t1.setPriority(10);
		t2.setPriority(1);
		t3.setPriority(6);
		
		t1.start();
		t2.start();
		t3.start();
	}
	
}


/**
 * 线程的礼让
 * 在线程操作中，也可以使用yield（）方法，将一个线程的操作暂时交给其他线程执行。
 * */
class ThreadYield implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + "运行" + i);
			if(i == 3){
				System.out.println("线程的礼让 ");
				Thread.currentThread().yield();// 本来到3要去执行B线程了，再礼让让回A线程继续执行,不过测试看来，也是有机率的，因为线程就是一个随机的东西，无法控制
			}
		}
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadYield(), "A");
		Thread t2 = new Thread(new ThreadYield(), "B");
		t1.start();
		t2.start();
	}
}


/**
 * 同步
 * 问题引出【比如说买票系统】
 * */
class ThreadSynchronizedAndDeadlock implements Runnable {

	private int count = 5;
	
	/* 有问题的代码块
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			if(count > 0){
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				System.out.println(count--);// 会出现-1,0
			}
		}
	}
	*/
	
	/*
	 * 用线程同步解决问题
	 * 采用同步的话，可以使用同步代码快，和同步方法两种来完成
	 * */
	
	/*
	// 1.同步代码快
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			
			// 同步代码块, this = 同步对象
			synchronized(this){
				if(count > 0){
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					System.out.println(count--);// 每一秒输出一个结果 5 4 3 2 1 
				}
			}
		}
	}
	*/
	
	// 2.同步方法
	public synchronized void sale() {
		if(count > 0){
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println(count--);// 每一秒输出一个结果 5 4 3 2 1 
		}
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			this.sale();
		}
	}
	
	public static void main(String[] args) {
		ThreadSynchronizedAndDeadlock tsd = new ThreadSynchronizedAndDeadlock();
		Thread t1 = new Thread(tsd);
		Thread t2 = new Thread(tsd);
		Thread t3 = new Thread(tsd);
		t1.start();
		t2.start(); 
		t3.start();
	}
}




/**
 * 火车票售票-实现剩余票数一致-未实现
 * */
class ImplRunnable_ticket implements Runnable {

	private int ticketTotal = 10; // 总票数
	private int ticketNumber; // 购票数
	
	private boolean flag = false;// 标识，是否还可以购买
	
	public ImplRunnable_ticket(int ticketNumber, boolean flag){
		this.ticketNumber = ticketNumber;
		this.flag = flag;
	}

	@Override
	public void run() {
		this.saleTicket();
	}
	
	private void saleTicket(){
		if(flag){
			synchronized (this) {
				
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
				
				if(ticketTotal <= 0){
					flag = false;// 不允许继续购买
					System.out.println("票已售完");
				}else {
					flag = true;
					ticketTotal = ticketTotal - ticketNumber;// 剩余票数
					System.out.println(Thread.currentThread().getName() + "售出" + ticketNumber + "张票，还剩余" + ticketTotal + "张票");
				}
			}
		}
	}
}

class TestImplRunnable_ticket {
	
	public static void main(String[] args) {
		ImplRunnable_ticket rtA = new ImplRunnable_ticket(5, true);
		ImplRunnable_ticket rtB = new ImplRunnable_ticket(1, true);
		ImplRunnable_ticket rtC = new ImplRunnable_ticket(1, true);
		ImplRunnable_ticket rtD = new ImplRunnable_ticket(3, true);
		
		Thread t1 = new Thread(rtA, "1号口");
		Thread t2 = new Thread(rtB, "2号口");
		Thread t3 = new Thread(rtC, "3号口");
		Thread t4 = new Thread(rtD, "4号口");
		
		ExecutorService service = Executors.newCachedThreadPool();

		service.execute(t1);
		service.execute(t2);
		service.execute(t3);
		service.execute(t4);

		service.shutdown();// 执行完线程池中的线程后尽快退出;
	}
}




