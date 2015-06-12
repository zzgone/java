package 异常处理;

public class Return顺序 {
	
	
	public static void main(String[] args) {
		tryCatchFinally();
	}
	
	/**
	 * try,catch,finally 语句执行顺序
	 * 程序正常运行时，在try区块。
	 * 程序触发异常时，在catch区块。
	 * 当前面两者执行完代码时，再去finally区块，此区块代表总是执行。
	 * 
	 * try,catch,finally 语句return顺序
	 * 假设程序正常运行，try区块语句执行完毕并return时，此时return不是真正的return，只是虚拟机做一个记录
	 * 等待finally执行完毕时，看finally中是否有return语句。如果有，则返回finally中的return，如果没有，则返回try语句中的return
	 * 程序触发异常，也同理。
	 * 
	 * try,catch中的return语句会执行，在finally前执行，但只是做一个记录。
	 * 
	 * 
	 * 下面代码为例：
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
