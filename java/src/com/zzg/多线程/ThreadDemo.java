package com.zzg.多线程;

public class ThreadDemo {
	
	/**
	 * 建立线程有2种方式
	 * 实现一个Runnable接口
	 * 继承Thread类
	 * */
	
	public static void main(String[] args) {
		
		MyThread myt = new MyThread();
		// 启动线程
		myt.start();
		
		MyRunnable myr = new MyRunnable();
		Thread t = new Thread(myr);
		t.start();
	}
	
	/**
	 * 通过Thread实现线程创建
	 * */
	public static void aaa() {
		
	}
	
}


class MyThread extends Thread {
	
	/**
	 * 线程与普通的类相比 比较特殊
	 * 线程需要运行的代码需要写在 run 方法中
	 * */
	@Override
	public void run() {
		System.out.println("mythead run");
	}
}

class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("MyRunnable run");
	}
	
}

