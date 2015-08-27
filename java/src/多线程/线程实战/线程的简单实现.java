package ���߳�.�߳�ʵս;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class �̵߳ļ�ʵ�� {

}

/* �̵߳�ʵ�� */

/**
 * 1.�̳�Thread�ֱ࣬�ӵ���run����
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
			System.out.println(name + "����    " + i);
		}
	}
	
	public static void main(String[] args) {
		ExtThread_1 et1 = new ExtThread_1("A thread");
		ExtThread_1 et2 = new ExtThread_1("B thread");
		et1.start(); // �����߳���start. �õ�cpu��Դÿ��ִ�н��������һ��, �̵߳�������Ҫ���ز���ϵͳ��֧��
		et2.start(); // ����start����ʵ�����ǵ�����һ��start0��native����������ʵ����������Ҫ����Ӳ���豸�ģ�CPU��
		
	}
}

/**
 * 2.ʵ��Runnable�ӿ�
 * */
class ImplRunnable_1 implements Runnable {

	private String name;
	
	public ImplRunnable_1(){
		
	}
	
	public ImplRunnable_1(String name){
		this.name = name;
	}
	
	@Override
	// �ӿڷ���������ʵ��
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(name + "����    " + i);
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


/* �߳�֮�����Դ���� */

/**
 * �̳�Thread�࣬������Դ����
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
 * ʵ��Runnable�ӿ�ʵ����Դ����
 * ʵ��Runnable�ӿڱȼ̳�Thread�������е����ƣ�
 * 1).�ʺ϶����ͬ�ĳ��������߳�ȥ����ͬһ����Դ
 * 2).���Ա���java�еĵ��̳е�����
 * 3).���ӳ���Ľ�׳�ԣ�������Ա�����̹߳�����������ݶ�����
 * */
class ImplRunnable_2 implements Runnable {

	private int ticket = 5;
	
	@Override
	public void run() {
		for (int i = 0; i <= 20; i++) {
			if(this.ticket > 0){
				System.out.println(Thread.currentThread().getName() + "������Ʊ��" + this.ticket --);
			}
		}
	}
	
	public static void main(String[] args) {
		ImplRunnable_2 r1 = new ImplRunnable_2();
		new Thread(r1, "1�Ŵ���").start();
		new Thread(r1, "2�Ŵ���").start();
		new Thread(r1, "3�Ŵ���").start();
	}
}

/**
 * ȡ���߳�����
 * */
class getThreadName implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	
	// main������ʵҲ��һ���̡߳���java�����Ե��̶߳���ͬʱ�����ģ�����ʲôʱ���ĸ���ִ�У���ȫ��˭�ȵõ�CPU����Դ��
	// ��java�У�ÿ�γ���������������2���̡߳�һ����main�̣߳�һ���������ռ��̡߳���Ϊÿ��ʹ��java����ִ��һ�����ʱ��ʵ���϶�������һ���ʣ֣ͣ�ÿһ����֣�ʵϰ�ھ����ڲ���ϵͳ��������һ�����̡�
	public static void main(String[] args) {
		getThreadName r3 = new getThreadName();
		new Thread(r3, "A").start();
		new Thread(r3, "B").start();
		new Thread(r3).start(); // ˵���������û��ָ�����ֵĻ���ϵͳ�Զ��ṩ���֡�
	}
}

/**
 * �ж��߳��Ƿ�����
 * */
class ThreadIsStart implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) {
		// ���߳�Ҳ�п��������߳̽���֮ǰ�������������̲߳���Ӱ�죬������Ϊ���̵߳Ľ�����������
		ThreadIsStart tis = new ThreadIsStart();
		Thread t = new Thread(tis);
		System.out.println("�߳�����֮ǰ --->" + t.isAlive());
		t.start();
		System.out.println("�߳�����֮�� --->" + t.isAlive());
	}
	
}


/**
 * �߳�ǿ��ִ�� - ���������� ��ɶ�ã�
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
			//���if������ʲô���壿����
			if(i > 40){
				try {
					t.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("main �߳�ִ�� " + i);
		}
	}
	
	
}


/**
 * �̵߳�����
 * */
class ThreadSleep implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(2000);// ����ѭ���󣬵����ｫ�ȴ�2�룬��ִ����һ��(��)����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + i);
		}
	}
	
	public static void main(String[] args) {
		ThreadSleep ts = new ThreadSleep();
		// ����߳̽���run�У�Ҳ�����ÿһ���̵߳ȴ�
		Thread t = new Thread(ts, "Thread");
		Thread t2 = new Thread(ts, "Runnable");
		t.start();
		t2.start();
	}
}

/**
 * �̵߳��ж�
 * */
class ThreadStop implements Runnable {

	@Override
	public void run() {
		System.out.println("ִ��run����");
		long startTime = System.currentTimeMillis();
		try {
			Thread.sleep(10000);
			System.out.println("�߳����sleep");
		} catch (Exception e) {
			System.out.println("sleep���ж�");
			long endTime = System.currentTimeMillis();
			System.out.println("sleep" + (endTime - startTime));
			return; // ���ص�����ĵ��ô�
		}
		System.out.println("�߳�������ֹ");
		long endTime = System.currentTimeMillis();
		System.out.println("sleep" + (endTime - startTime));
	}
	
	public static void main(String[] args) {
		ThreadStop ts = new ThreadStop();
		Thread t = new Thread(ts, "�߳�[a]");
		t.start();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// ע�ͺ�����ֹͣ�߳�
		t.interrupt(); // 2����ж��߳�
	}
}


/**
 * �����ػ��߳�(��̨�߳�)
 * ��java�����У�ֻҪǰ̨��һ���߳������У�����java������̲�����ʧ
 * ���Դ�ʱ��������һ���ػ��̣߳�������ʹjava������ʧ�ˣ����ػ��߳���Ȼ�ܹ���������
 * */
class DaemonThread implements Runnable {

	@Override
	public void run() {
		while(true){
			System.out.println(Thread.currentThread().getName() + "��������");
		}
	}
	
	public static void main(String[] args) {
		DaemonThread dt = new DaemonThread();
		Thread t = new Thread(dt, "�߳�[a]");
		System.out.println("start");
		t.setDaemon(true);
		t.start();
	}
}


/**
 * �̵߳����ȼ�
 * */
class ThreadPriority implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + "����" + i);
		}
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadPriority(), "a");
		Thread t2 = new Thread(new ThreadPriority(), "b");
		Thread t3 = new Thread(new ThreadPriority(), "c");
		
		// ��Ȼ�������̵߳����ȼ�����������˵���ȼ�Խ�߾���ִ�У�����ȡ����˭������CPU��Դ�����������ȼ�����ִ�еļ���Ҫ��Щ.. ���̵߳����ȼ���5
		t1.setPriority(10);
		t2.setPriority(1);
		t3.setPriority(6);
		
		t1.start();
		t2.start();
		t3.start();
	}
	
}


/**
 * �̵߳�����
 * ���̲߳����У�Ҳ����ʹ��yield������������һ���̵߳Ĳ�����ʱ���������߳�ִ�С�
 * */
class ThreadYield implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + "����" + i);
			if(i == 3){
				System.out.println("�̵߳����� ");
				Thread.currentThread().yield();// ������3Ҫȥִ��B�߳��ˣ��������û�A�̼߳���ִ��,�������Կ�����Ҳ���л��ʵģ���Ϊ�߳̾���һ������Ķ������޷�����
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
 * ͬ��
 * ��������������˵��Ʊϵͳ��
 * */
class ThreadSynchronizedAndDeadlock implements Runnable {

	private int count = 5;
	
	/* ������Ĵ����
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			if(count > 0){
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				System.out.println(count--);// �����-1,0
			}
		}
	}
	*/
	
	/*
	 * ���߳�ͬ���������
	 * ����ͬ���Ļ�������ʹ��ͬ������죬��ͬ���������������
	 * */
	
	/*
	// 1.ͬ�������
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			
			// ͬ�������, this = ͬ������
			synchronized(this){
				if(count > 0){
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					System.out.println(count--);// ÿһ�����һ����� 5 4 3 2 1 
				}
			}
		}
	}
	*/
	
	// 2.ͬ������
	public synchronized void sale() {
		if(count > 0){
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println(count--);// ÿһ�����һ����� 5 4 3 2 1 
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
 * ��Ʊ��Ʊ-ʵ��ʣ��Ʊ��һ��-δʵ��
 * */
class ImplRunnable_ticket implements Runnable {

	private int ticketTotal = 10; // ��Ʊ��
	private int ticketNumber; // ��Ʊ��
	
	private boolean flag = false;// ��ʶ���Ƿ񻹿��Թ���
	
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
					flag = false;// �������������
					System.out.println("Ʊ������");
				}else {
					flag = true;
					ticketTotal = ticketTotal - ticketNumber;// ʣ��Ʊ��
					System.out.println(Thread.currentThread().getName() + "�۳�" + ticketNumber + "��Ʊ����ʣ��" + ticketTotal + "��Ʊ");
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
		
		Thread t1 = new Thread(rtA, "1�ſ�");
		Thread t2 = new Thread(rtB, "2�ſ�");
		Thread t3 = new Thread(rtC, "3�ſ�");
		Thread t4 = new Thread(rtD, "4�ſ�");
		
		ExecutorService service = Executors.newCachedThreadPool();

		service.execute(t1);
		service.execute(t2);
		service.execute(t3);
		service.execute(t4);

		service.shutdown();// ִ�����̳߳��е��̺߳󾡿��˳�;
	}
}




