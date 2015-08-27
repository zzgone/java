package 多线程.线程实战;

public class 死锁 {
	/**
	 * 以下demo由经典案例【生产者和消费者问题】 如何解决？ 1.加入同步 2.加入等待和唤醒
	 * */
}

// ---------------------------------- 最初代码

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
// * 生产者
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
// this.info.setName("小白");
// try {
// Thread.sleep(100);
// } catch (Exception e) {
// e.printStackTrace();
// }
// this.info.setAge(3);
// flag = false;
// } else {
// this.info.setName("大黄");
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
// * 消费者类
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
// * 测试类
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

// ---------------------------------- 加入同步代码
// 错乱的问题解决了,现在是小白=3，大黄=100.但是还是出现了重复读取的问题，也肯定有重复覆盖的问题

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
// * 生产者
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
// this.info.set("小白", 3);
// flag = false;
// } else {
// this.info.set("大黄", 100);
// flag = true;
// }
// }
// }
// }
//
// /**
// * 消费者类
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
// * 测试类
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

// ---------------------------------- 加入唤醒和等待
// 错乱的问题解决了,现在是小白=3，大黄=100.但是还是出现了重复读取的问题，也肯定有重复覆盖的问题
// 要完成上面的功能，我们只需要修改Info类饥渴，在其中加上标志位，并且通过判断标志位完成等待和唤醒的操作

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
 * 生产者
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
				this.info.set("小白", 3);
				flag = false;
			} else {
				this.info.set("大黄", 100);
				flag = true;
			}
		}
	}
}

/**
 * 消费者类
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
 * 测试类
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
