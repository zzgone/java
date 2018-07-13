package com.zzg.¶àÏß³Ì;

public class TDemo {

	public static void a() {
		System.out.println("a");
	}

	public static void b() {
		System.out.println("b");
	}

	public static void c() {
		System.out.println("c");
	}

	public static void main(String[] args) {
		a();
		b();
		c();
		
		ThreadTest t1 = new ThreadTest(1);
		ThreadTest t2 = new ThreadTest(2);
		ThreadTest t3 = new ThreadTest(3);
		ThreadTest t4 = new ThreadTest(4);
		ThreadTest t5 = new ThreadTest(5);
		ThreadTest t6 = new ThreadTest(6);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
	}
}

class ThreadTest extends Thread {

	private int id;

	public ThreadTest(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		System.out.println(id);
	}

}
