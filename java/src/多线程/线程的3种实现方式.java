package ���߳�;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class �̵߳�3��ʵ�ַ�ʽ {

	public static void main(String[] args) {
		//thread
		ThreadTest1 tt1 = new ThreadTest1();
		tt1.start();
		
		//thread(tt2);
		ThreadTest2 tt2 = new ThreadTest2();
		Thread t2 = new Thread(tt2);
		t2.start();
	}
	
}


// 1.�̳�Thread�࣬��ʵ��ThreadҲʵ����Runnable�ӿ�
class ThreadTest1 extends Thread{
	
	@Override
	public void run() {
		System.out.println("extends thread");
	}
}


// 2.ֱ��ʵ��Runnable�ӿ�
class ThreadTest2 implements Runnable{

	@Override
	public void run() {
		System.out.println("implements Runnbale");
	}
}



/**
 * 3. ʹ��ExecutorService��Callable��Futureʵ���з��ؽ���Ķ��߳�
 * ExecutorService��Callable��Future�������ʵ���϶�������Executor����еĹ����ࡣ
 * ��Ҫ��ϸ�˽�Executor��ܵĿ��Է��� http://www.javaeye.com/topic/366591��������Ըÿ�����˺���ϸ�Ľ��͡� 
 * ���ؽ�����߳�����JDK1.5���������������ȷʵ��ʵ�ã��������������ҾͲ���Ҫ��Ϊ�˵õ�����ֵ����������ˣ����Ҽ���ʵ����Ҳ����©���ٳ���
 * ����ֵ���������ʵ��Callable�ӿڣ����Ƶģ��޷���ֵ���������Runnable�ӿڡ�
 * ִ��Callable����󣬿��Ի�ȡһ��Future�Ķ����ڸö����ϵ���get�Ϳ��Ի�ȡ��Callable���񷵻ص�Object��
 * �ٽ���̳߳ؽӿ�ExecutorService�Ϳ���ʵ�ִ�˵���з��ؽ���Ķ��߳��ˡ�
 * �����ṩ��һ���������з��ؽ���Ķ��̲߳������ӣ���JDK1.5����֤��û�������ֱ��ʹ��
 * 
 * 
 * �����̶���Ŀ�̵߳��̳߳ء�
 * public static ExecutorService newFixedThreadPool(int nThreads) 
 * 
 * ����һ���ɻ�����̳߳أ�����execute ��������ǰ������̣߳�����߳̿��ã�����������߳�û�п��õģ��򴴽�һ�����̲߳���ӵ����С���ֹ���ӻ������Ƴ���Щ���� 60 ����δ��ʹ�õ��̡߳�
 * public static ExecutorService newCachedThreadPool() 
 * 
 * ����һ�����̻߳���Executor��
 * public static ExecutorService newSingleThreadExecutor() 
 * 
 * ����һ��֧�ֶ�ʱ�������Ե�����ִ�е��̳߳أ���������¿��������Timer�ࡣ
 * public static ScheduledExecutorService newScheduledThreadPool(int corePoolSize) 
 * 
 * ExecutoreService�ṩ��submit()����������һ��Callable����Runnable������Future�����Executor��̨�̳߳ػ�û�����Callable�ļ��㣬����÷���Future�����get()������������ֱ��������
 * 
 * */
class ThreadTest3 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		System.out.println("----����ʼ����----");
		Date date1 = new Date(); // ����ʱ��

		int taskSize = 5;
		// ����һ���̳߳�
		ExecutorService pool = Executors.newFixedThreadPool(taskSize);
		// ��������з���ֵ������
		List<Future> list = new ArrayList<Future>();
		for (int i = 0; i < taskSize; i++) {

			Callable c = new MyCallable(i + " ");

			// ִ�����񲢻�ȡFuture����
			Future f = pool.submit(c);

			// System.out.println(">>>" + f.get().toString());
			list.add(f);
		}
		// �ر��̳߳�
		pool.shutdown();
		// ��ȡ���в�����������н��
		for (Future f : list) {
			// ��Future�����ϻ�ȡ����ķ���ֵ�������������̨
			System.out.println(">>>" + f.get().toString());
		}

		Date date2 = new Date();  
		System.out.println("----�����������----����������ʱ�䡾" + (date2.getTime() - date1.getTime()) + "���롿");  
	}

}

class MyCallable implements Callable<Object> {

	private String taskNum;
	
	//���췽��
	MyCallable(String taskNum){
		this.taskNum = taskNum;
	}
	
	@Override
	public Object call() throws Exception {
		System.out.println(">>>" + taskNum + "��������");  
		Date dateTmp1 = new Date();  
		Thread.sleep(1000);  // ����1000����
		
		Date dateTmp2 = new Date();
		long time = dateTmp2.getTime() - dateTmp1.getTime(); 
		
		System.out.println(">>>" + taskNum + "������ֹ");  
		return taskNum + "���񷵻����н��,��ǰ����ʱ�䡾" + time + "���롿";  
	}
}