package 多线程;

public class 查看线程的运行状态 {

	/**
	 * 线程共有 新建、就绪、运行(可运行)、阻塞、等待、计时等待和终止 7种状态
	 * 
	 * 当使用new操作符创建新线程时：线程处于新建状态。
	 * 当调用start()方法时：线程处于运行(可运行)状态。
	 * 当线程需要获得对象的内置锁，而该锁正被其他线程拥有时：线程处于阻塞状态。
	 * 当线程等待其他线程通知调度表可以运行时：该线程处于等待状态。
	 * 对于一些含有时间参数的方法，如Thread类的sleep()方法，可以时线程处于计时等待状态。
	 * 当run()方法运行完毕或出现异常时：线程处于终止状态。
	 * 
	 * */
}


class ThreadState implements Runnable{
	
	public synchronized void waitForASecond() throws InterruptedException{
		wait(500);//使当前线程等待0.5秒或其他线程调用notify()或notifyAll()方法
	}
	
	public synchronized void waitForYears() throws InterruptedException{
		wait();//使当前线程永久等待，直到其他线程调用notify()或notifyAll()方法
	}
	
	public synchronized void notifyNow(){
		notify();//唤醒由调用wait()方法进入等待状态的线程
	}
	
	@Override
	public void run() {
		try {
			// 在新线程中运行方法
			waitForASecond();
			waitForYears();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}


class TestThread1 {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws Exception {
		ThreadState ts = new ThreadState();
		Thread t = new Thread(ts);
		
		System.out.println("新建线程:" + t.getState()); // 输出线程状态
		t.start();//启动线程
		
		//现在线程其实是处于就绪状态，只不过这种状态不能表示出来，直到start获得系统资源，才是运行状态
		
		System.out.println("启动线程:" + t.getState());
		t.sleep(100);//休眠0.1秒，使新线程运行waitForASecond()方法
		
		System.out.println("计时等待:" + t.getState());
		t.sleep(1000);//休眠1秒，使新线程运行waitForYears()方法
		
		System.out.println("等待线程:" + t.getState());
		
		ts.notifyNow();//notify
		System.out.println("阻塞线程:" + t.getState());// 此时还处于阻塞状态，当在阻塞的同时也在唤醒该线程，再让线程处于可运行状态
		System.out.println("可运行(唤醒)线程:" + t.getState());// 可以用这一步求证 ...因为时间的关系~ 线程是非常快速的，而syso输出一句话也需要时间。所以能得到线程最新状态，和下面sleep作用一样
		t.sleep(1000);
		System.out.println("终止线程:" + t.getState());
	}
	
}



//线程的中断
/**
* 在以往时候会使用stop()停止线程，当JDK早已废除。
* 同时也不建议用stop()来停止一个线程的运行、
* 现在提倡在run()方法中定义标记。来停止
* 
* public void run(){
* 	while(true){
* 		....
* 		if(isBreak){
* 			break;// 结束
* 		}
* 	}
* }
* */
