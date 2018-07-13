package com.zzg.多线程;

/**
 * 同步资源
 * synchronized 同步
 * */
public class TongBuZiYuan {

	public static void main(String[] args) {
		
		MaiPiaoThread t1 = new MaiPiaoThread();
		MaiPiaoThread t2 = new MaiPiaoThread();
		MaiPiaoThread t3 = new MaiPiaoThread();
		MaiPiaoThread t4 = new MaiPiaoThread();
		MaiPiaoThread t5 = new MaiPiaoThread();
		MaiPiaoThread t6 = new MaiPiaoThread();
		MaiPiaoThread t7 = new MaiPiaoThread();
		MaiPiaoThread t8 = new MaiPiaoThread();
		MaiPiaoThread t9 = new MaiPiaoThread();
		MaiPiaoThread t10 = new MaiPiaoThread();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
	}
}


class MaiPiaoThread extends Thread {
	
	private static int piao = 5;
	
	// 这是一个同步方法
	private synchronized void maipiao() {
		if (piao > 0) {
			piao--;
			System.out.println("卖出了一张票，还剩余" + piao);
			
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} else {
			System.out.println("已经没有票了，快滚" + piao);
		}
	}
	
	@Override
	public void run() {
		maipiao();
	}
	
}
