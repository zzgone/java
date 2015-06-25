package 多线程;

import java.util.ArrayList;
import java.util.List;

public class 查看JVM中的线程名 {

	/**
	 * 可以从当前例子中看出，线程的状态、线程的优先级、是否为守护线程等。
	 * 
	 * 时刻要注意线程的状态。不同的状态下，线程能够执行的任务是不同的。
	 * */
}

class ThreadList{
	
	public static void main(String[] args) {
		for (String string : getThreadsGroups(getRootThreadGroups())) {
			System.out.println(string);
		}
	}
	
	//获得给定线程组所有线程名
	public static List<String> getThreadsGroups(ThreadGroup group){
		// 创建保存线程名的列表
		List<String> threadList = new ArrayList<String>();
		//根据活动线程数创建线程数组
		Thread[] threads = new Thread[group.activeCount()];
		int count = group.enumerate(threads, false);// 复制线程到线程数组
		for (int i = 0; i < count; i++) {
			threadList.add(group.getName() + "线程组:" + threads[i].getName());
		}
		return threadList;
	}
	
	// 获得根线程组
	private static ThreadGroup getRootThreadGroups(){
		//获得当前线程组
		ThreadGroup rootGroup = Thread.currentThread().getThreadGroup();
		while (true) {
			//如果getParent()方法的返回值非空，则不是根线程组
			if(rootGroup.getParent() != null){
				rootGroup = rootGroup.getParent();// 获得父线程组
			}else {
				break;// 到达根线程组则退出循环
			}
		}
		return rootGroup;
	}
	

}