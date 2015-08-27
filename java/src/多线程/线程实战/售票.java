package 多线程.线程实战;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class 售票 {

}

class TicketSaler implements Runnable {
	private Map<String, Boolean> ticketMap;// 票池
	private String salerName;// 售票员姓名

	public TicketSaler(Map<String, Boolean> ticketMap, String salerName) {
		this.ticketMap = ticketMap;
		this.salerName = salerName;
	}

	// 售票
	private void saleTicket() {

		for (Iterator<String> it = ticketMap.keySet().iterator();;) {
			synchronized (ticketMap) {
				if (it.hasNext()) {
					String ticketNo = it.next();
					if (!ticketMap.get(ticketNo)) {
						System.out
								.println(salerName + ":" + ticketNo + "已被售出。");
						ticketMap.put(ticketNo, true);
					}
				} else {
					break;
				}
			}
		}
	}

	public void run() {
		saleTicket();
	}

}

class TicketSalerConsole {


	public static void main(String[] args) {
		Map<String, Boolean> ticketMap = new HashMap<String, Boolean>();// 票池：<票编号,是否已出售>
		for (int i = 1; i <= 1000; i++) {// 生成1000张火车票到票池
			ticketMap.put("T" + i, false);
		}

		// 生成4名售票员
		TicketSaler s1 = new TicketSaler(ticketMap, "S1");
		TicketSaler s2 = new TicketSaler(ticketMap, "S2");
		TicketSaler s3 = new TicketSaler(ticketMap, "S3");
		TicketSaler s4 = new TicketSaler(ticketMap, "S4");

		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);
		Thread t3 = new Thread(s3);
		Thread t4 = new Thread(s4);

		t1.setName("T1");
		t2.setName("T2");
		t3.setName("T3");
		t4.setName("T4");

		ExecutorService service = Executors.newCachedThreadPool();

		service.execute(t1);
		service.execute(t2);
		service.execute(t3);
		service.execute(t4);

		// service.shutdown();// 执行完线程池中的线程后尽快退出
	}

}


// 出售100张票
class SaleTicket implements Runnable {

	public int total;
	public int count;
	
	public SaleTicket() {
		total = 100;
		count = 0;
	}

	public void run() {
		while (total > 0) {
			synchronized (this) {
				if (total > 0) {
					try {
						 Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					count++;
					total--;
					System.out.println(Thread.currentThread().getName()+ "\t当前票号：" + count);
				}
			}
		}
	}

	public static void main(String[] args) {
		SaleTicket st = new SaleTicket();
		new Thread(st, "售票点A").start();
		new Thread(st, "售票点B").start();
		new Thread(st, "售票点C").start();
		new Thread(st, "售票点D").start();
	}

}
