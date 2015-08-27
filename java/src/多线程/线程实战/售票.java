package ���߳�.�߳�ʵս;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ��Ʊ {

}

class TicketSaler implements Runnable {
	private Map<String, Boolean> ticketMap;// Ʊ��
	private String salerName;// ��ƱԱ����

	public TicketSaler(Map<String, Boolean> ticketMap, String salerName) {
		this.ticketMap = ticketMap;
		this.salerName = salerName;
	}

	// ��Ʊ
	private void saleTicket() {

		for (Iterator<String> it = ticketMap.keySet().iterator();;) {
			synchronized (ticketMap) {
				if (it.hasNext()) {
					String ticketNo = it.next();
					if (!ticketMap.get(ticketNo)) {
						System.out
								.println(salerName + ":" + ticketNo + "�ѱ��۳���");
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
		Map<String, Boolean> ticketMap = new HashMap<String, Boolean>();// Ʊ�أ�<Ʊ���,�Ƿ��ѳ���>
		for (int i = 1; i <= 1000; i++) {// ����1000�Ż�Ʊ��Ʊ��
			ticketMap.put("T" + i, false);
		}

		// ����4����ƱԱ
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

		// service.shutdown();// ִ�����̳߳��е��̺߳󾡿��˳�
	}

}


// ����100��Ʊ
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
					System.out.println(Thread.currentThread().getName()+ "\t��ǰƱ�ţ�" + count);
				}
			}
		}
	}

	public static void main(String[] args) {
		SaleTicket st = new SaleTicket();
		new Thread(st, "��Ʊ��A").start();
		new Thread(st, "��Ʊ��B").start();
		new Thread(st, "��Ʊ��C").start();
		new Thread(st, "��Ʊ��D").start();
	}

}
