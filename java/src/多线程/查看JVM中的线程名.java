package ���߳�;

import java.util.ArrayList;
import java.util.List;

public class �鿴JVM�е��߳��� {

	/**
	 * ���Դӵ�ǰ�����п������̵߳�״̬���̵߳����ȼ����Ƿ�Ϊ�ػ��̵߳ȡ�
	 * 
	 * ʱ��Ҫע���̵߳�״̬����ͬ��״̬�£��߳��ܹ�ִ�е������ǲ�ͬ�ġ�
	 * */
}

class ThreadList{
	
	public static void main(String[] args) {
		for (String string : getThreadsGroups(getRootThreadGroups())) {
			System.out.println(string);
		}
	}
	
	//��ø����߳��������߳���
	public static List<String> getThreadsGroups(ThreadGroup group){
		// ���������߳������б�
		List<String> threadList = new ArrayList<String>();
		//���ݻ�߳��������߳�����
		Thread[] threads = new Thread[group.activeCount()];
		int count = group.enumerate(threads, false);// �����̵߳��߳�����
		for (int i = 0; i < count; i++) {
			threadList.add(group.getName() + "�߳���:" + threads[i].getName());
		}
		return threadList;
	}
	
	// ��ø��߳���
	private static ThreadGroup getRootThreadGroups(){
		//��õ�ǰ�߳���
		ThreadGroup rootGroup = Thread.currentThread().getThreadGroup();
		while (true) {
			//���getParent()�����ķ���ֵ�ǿգ����Ǹ��߳���
			if(rootGroup.getParent() != null){
				rootGroup = rootGroup.getParent();// ��ø��߳���
			}else {
				break;// ������߳������˳�ѭ��
			}
		}
		return rootGroup;
	}
	

}