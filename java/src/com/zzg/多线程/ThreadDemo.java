package com.zzg.���߳�;

public class ThreadDemo {
	
	/**
	 * �����߳���2�ַ�ʽ
	 * ʵ��һ��Runnable�ӿ�
	 * �̳�Thread��
	 * */
	
	public static void main(String[] args) {
		
		MyThread myt = new MyThread();
		// �����߳�
		myt.start();
		
		MyRunnable myr = new MyRunnable();
		Thread t = new Thread(myr);
		t.start();
	}
	
	/**
	 * ͨ��Threadʵ���̴߳���
	 * */
	public static void aaa() {
		
	}
	
}


class MyThread extends Thread {
	
	/**
	 * �߳�����ͨ������� �Ƚ�����
	 * �߳���Ҫ���еĴ�����Ҫд�� run ������
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

