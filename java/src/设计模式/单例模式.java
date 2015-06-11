package ���ģʽ;

public class ����ģʽ {

}

/**
 * �̰߳�ȫ����Ч�ʱȽϵͣ�һ��ʼ��Ҫ������new һ������
 * 
 * ����ʽ
 * */
 class SingletonEHan{
	 private SingletonEHan(){
		 // step 1
	 }
	 
	 // step 2 : ��һ��ʼ�ͳ�ʼ��һ��ʵ����������final
	 private static final SingletonEHan instance = new SingletonEHan();
	 
	 // step 3 : ��Զֻ���س�ʼ��ʱ��ʵ��
	 public static SingletonEHan getInstance(){
		 return instance;
	 }
	 
 }
 
 
/**
 * ����̷߳���ʱ�Ͳ����̰߳�ȫ�ģ����صĲ���ͬһ������
 * 
 * ����ʽ
 * */
class SingletonBHan{
	
	// step2: ˽�л�һ����ǰ��ľ�̬��������ʼֵ null
	private static SingletonBHan instance = null;
	
	private SingletonBHan(){
		// step1: ˽�л����죬�õ�ǰʵ���޷�ͨ�� new Singleton() ������
	}
	
	// step3: ��ȡʵ����instance ��ʼֵΪ null�����Ե�һ��getInstanceʱ��Ȼ��new һ��ʵ������
	//���������޸ĵ�instance��ֵ������һ��getInstanceʱ, instanceֵ�Ѳ�Ϊnull������ ��������ԭ�е� instance����
	public static SingletonBHan getInstance(){
		if(instance == null){
			instance = new SingletonBHan();
		}
		return instance;
	}
	
	// step4: ��֤�Ƿ��ǵ���
	public void testInstance(){
		if(instance == null){
			System.out.println("instance is null");
		}else {
			System.out.println("instance is not null");
		}
	}
}

/**
 * �̰߳�ȫ ����Ч�ʷǳ��ͣ���һ��ʱ��ֻ��һ���߳��ܷ��ʣ�ͬʱ����һ������
 * 
 * ����ʽ �̰߳�ȫ
 * */
class SingletonBHanSynchronized{
	private SingletonBHanSynchronized(){
		// step 1
	}
	
	private static SingletonBHanSynchronized instance;
	// �ͱ���ʽ����ֻ�ǼӸ� synchronized
	public static synchronized SingletonBHanSynchronized getInstance(){
		if(instance == null){
			instance = new SingletonBHanSynchronized();
		}
		return instance;
	}
}

/**
 * �̰߳�ȫ������Ч�ʸߣ�֧�ֶ��߳�
 * 
 * */
class SingletonSynchronized{
	private SingletonSynchronized(){
		// step 1
	}
	
	// setp 2
	private static SingletonSynchronized instance;
	
	public static SingletonSynchronized getInstance(){
		// step 3
		if(instance == null){
			// step 4
			synchronized(SingletonSynchronized.class){
				if(instance == null){
					instance = new SingletonSynchronized();
				}
			}
		}
		return instance;
	}
}