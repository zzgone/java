package ���߳�;

public class �鿴�̵߳�����״̬ {

	/**
	 * �̹߳��� �½�������������(������)���������ȴ�����ʱ�ȴ�����ֹ 7��״̬
	 * 
	 * ��ʹ��new�������������߳�ʱ���̴߳����½�״̬��
	 * ������start()����ʱ���̴߳�������(������)״̬��
	 * ���߳���Ҫ��ö���������������������������߳�ӵ��ʱ���̴߳�������״̬��
	 * ���̵߳ȴ������߳�֪ͨ���ȱ��������ʱ�����̴߳��ڵȴ�״̬��
	 * ����һЩ����ʱ������ķ�������Thread���sleep()����������ʱ�̴߳��ڼ�ʱ�ȴ�״̬��
	 * ��run()����������ϻ�����쳣ʱ���̴߳�����ֹ״̬��
	 * 
	 * */
}


class ThreadState implements Runnable{
	
	public synchronized void waitForASecond() throws InterruptedException{
		wait(500);//ʹ��ǰ�̵߳ȴ�0.5��������̵߳���notify()��notifyAll()����
	}
	
	public synchronized void waitForYears() throws InterruptedException{
		wait();//ʹ��ǰ�߳����õȴ���ֱ�������̵߳���notify()��notifyAll()����
	}
	
	public synchronized void notifyNow(){
		notify();//�����ɵ���wait()��������ȴ�״̬���߳�
	}
	
	@Override
	public void run() {
		try {
			// �����߳������з���
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
		
		System.out.println("�½��߳�:" + t.getState()); // ����߳�״̬
		t.start();//�����߳�
		
		//�����߳���ʵ�Ǵ��ھ���״̬��ֻ��������״̬���ܱ�ʾ������ֱ��start���ϵͳ��Դ����������״̬
		
		System.out.println("�����߳�:" + t.getState());
		t.sleep(100);//����0.1�룬ʹ���߳�����waitForASecond()����
		
		System.out.println("��ʱ�ȴ�:" + t.getState());
		t.sleep(1000);//����1�룬ʹ���߳�����waitForYears()����
		
		System.out.println("�ȴ��߳�:" + t.getState());
		
		ts.notifyNow();//notify
		System.out.println("�����߳�:" + t.getState());// ��ʱ����������״̬������������ͬʱҲ�ڻ��Ѹ��̣߳������̴߳��ڿ�����״̬
		System.out.println("������(����)�߳�:" + t.getState());// ��������һ����֤ ...��Ϊʱ��Ĺ�ϵ~ �߳��Ƿǳ����ٵģ���syso���һ�仰Ҳ��Ҫʱ�䡣�����ܵõ��߳�����״̬��������sleep����һ��
		t.sleep(1000);
		System.out.println("��ֹ�߳�:" + t.getState());
	}
	
}



//�̵߳��ж�
/**
* ������ʱ���ʹ��stop()ֹͣ�̣߳���JDK���ѷϳ���
* ͬʱҲ��������stop()��ֹͣһ���̵߳����С�
* �����ᳫ��run()�����ж����ǡ���ֹͣ
* 
* public void run(){
* 	while(true){
* 		....
* 		if(isBreak){
* 			break;// ����
* 		}
* 	}
* }
* */
