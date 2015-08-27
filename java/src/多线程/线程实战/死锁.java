package ���߳�.�߳�ʵս;

public class ���� {
	/**
	 * ����demo�ɾ��䰸���������ߺ����������⡿ ��ν���� 1.����ͬ�� 2.����ȴ��ͻ���
	 * */
}

// ---------------------------------- �������

// class InfoPojo {
// private String name = "Rollen";
// private int age = 20;
//
// public String getName() {
// return name;
// }
//
// public void setName(String name) {
// this.name = name;
// }
//
// public int getAge() {
// return age;
// }
//
// public void setAge(int age) {
// this.age = age;
// }
// }
//
// /**
// * ������
// * */
// class Producer implements Runnable {
// private InfoPojo info = null;
//
// Producer(InfoPojo info) {
// this.info = info;
// }
//
// public void run() {
// boolean flag = false;
//
// for (int i = 0; i < 25; ++i) {
// if (flag) {
// this.info.setName("С��");
// try {
// Thread.sleep(100);
// } catch (Exception e) {
// e.printStackTrace();
// }
// this.info.setAge(3);
// flag = false;
// } else {
// this.info.setName("���");
// try {
// Thread.sleep(100);
// } catch (Exception e) {
// e.printStackTrace();
// }
// this.info.setAge(100);
// flag = true;
// }
// }
// }
// }
//
// /**
// * ��������
// * */
// class Consumer implements Runnable {
// private InfoPojo info = null;
//
// public Consumer(InfoPojo info) {
// this.info = info;
// }
//
// public void run() {
// for (int i = 0; i < 25; ++i) {
// try {
// Thread.sleep(100);
// } catch (Exception e) {
// e.printStackTrace();
// }
// System.out.println(this.info.getName() + "<---->"+ this.info.getAge());
// }
// }
// }
//
// /**
// * ������
// * */
// class hello {
// public static void main(String[] args) {
// InfoPojo info = new InfoPojo();
// Producer pro = new Producer(info);
// Consumer con = new Consumer(info);
// new Thread(pro).start();
// new Thread(con).start();
// }
// }

// ---------------------------------- ����ͬ������
// ���ҵ���������,������С��=3�����=100.���ǻ��ǳ������ظ���ȡ�����⣬Ҳ�϶����ظ����ǵ�����

// class Info {
// private String name = "Rollen";
// private int age = 20;
//
// public String getName() {
// return name;
// }
// public void setName(String name) {
// this.name = name;
// }
// public int getAge() {
// return age;
// }
// public void setAge(int age) {
// this.age = age;
// }
//
// public synchronized void set(String name, int age){
// this.name=name;
// try{
// Thread.sleep(100);
// }catch (Exception e) {
// e.printStackTrace();
// }
// this.age=age;
// }
//
// public synchronized void get(){
// try{
// Thread.sleep(100);
// }catch (Exception e) {
// e.printStackTrace();
// }
// System.out.println(this.getName()+"<===>"+this.getAge());
// }
// }
//
// /**
// * ������
// * */
// class Producer implements Runnable {
// private Info info = null;
// Producer(Info info) {
// this.info = info;
// }
//
// public void run() {
// boolean flag = false;
// for (int i = 0; i < 25; ++i) {
// if (flag) {
// this.info.set("С��", 3);
// flag = false;
// } else {
// this.info.set("���", 100);
// flag = true;
// }
// }
// }
// }
//
// /**
// * ��������
// * */
// class Consumer implements Runnable {
// private Info info = null;
// public Consumer(Info info) {
// this.info = info;
// }
//
// public void run() {
// for (int i = 0; i < 25; ++i) {
// try {
// Thread.sleep(100);
// } catch (Exception e) {
// e.printStackTrace();
// }
// this.info.get();
// }
// }
// }
//
// /**
// * ������
// * */
// class hello {
// public static void main(String[] args) {
// Info info = new Info();
// Producer pro = new Producer(info);
// Consumer con = new Consumer(info);
// new Thread(pro).start();
// new Thread(con).start();
// }
// }

// ---------------------------------- ���뻽�Ѻ͵ȴ�
// ���ҵ���������,������С��=3�����=100.���ǻ��ǳ������ظ���ȡ�����⣬Ҳ�϶����ظ����ǵ�����
// Ҫ�������Ĺ��ܣ�����ֻ��Ҫ�޸�Info�༢�ʣ������м��ϱ�־λ������ͨ���жϱ�־λ��ɵȴ��ͻ��ѵĲ���

class Info {
	private String name = "Rollen";
	private int age = 20;
	private boolean flag = false;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public synchronized void set(String name, int age) {
		if (!flag) {
			try {
				super.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		this.name = name;

		try {
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.age = age;
		flag = false;
		super.notify();
	}

	public synchronized void get() {
		if (flag) {
			try {
				super.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		try {
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(this.getName() + "<===>" + this.getAge());
		flag = true;
		super.notify();
	}
}

/**
 * ������
 * */
class Producer implements Runnable {
	private Info info = null;
	Producer(Info info) {
		this.info = info;
	}
	
	public void run() {
		boolean flag = false;
		for (int i = 0; i < 25; ++i) {
			if (flag) {
				this.info.set("С��", 3);
				flag = false;
			} else {
				this.info.set("���", 100);
				flag = true;
			}
		}
	}
}

/**
 * ��������
 * */
class Consumer implements Runnable {

	private Info info = null;

	public Consumer(Info info) {
		this.info = info;
	}

	public void run() {
		for (int i = 0; i < 25; ++i) {
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
			this.info.get();
		}
	}
}

/**
 * ������
 * */
class hello {

	public static void main(String[] args) {
		Info info = new Info();
		Producer pro = new Producer(info);
		Consumer con = new Consumer(info);
		new Thread(pro).start();
		new Thread(con).start();
	}
}
