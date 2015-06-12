package �쳣����;

public class Return˳�� {
	
	
	public static void main(String[] args) {
		tryCatchFinally();
	}
	
	/**
	 * try,catch,finally ���ִ��˳��
	 * ������������ʱ����try���顣
	 * ���򴥷��쳣ʱ����catch���顣
	 * ��ǰ������ִ�������ʱ����ȥfinally���飬�������������ִ�С�
	 * 
	 * try,catch,finally ���return˳��
	 * ��������������У�try�������ִ����ϲ�returnʱ����ʱreturn����������return��ֻ���������һ����¼
	 * �ȴ�finallyִ�����ʱ����finally���Ƿ���return��䡣����У��򷵻�finally�е�return�����û�У��򷵻�try����е�return
	 * ���򴥷��쳣��Ҳͬ��
	 * 
	 * try,catch�е�return����ִ�У���finallyǰִ�У���ֻ����һ����¼��
	 * 
	 * 
	 * �������Ϊ����
	 * */
	private static String tryCatchFinally(){
		String arr[] = {"a","b","c","d","e"};// length 0-4
		
		try {
			System.out.println("in try");
			
			System.out.println(arr[5]);
			
			System.out.println("out try");
			return "try";
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("in catch");
			
			System.out.println(e);
			
			System.out.println("out catch");
			
			return "catch";
		} finally {
			
			System.out.println("in finally");
			
//			return "finally";
		}
	}
}
