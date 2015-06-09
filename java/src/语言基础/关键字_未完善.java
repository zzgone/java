package 语言基础;

public class 关键字_未完善 {

	/**
	 * continue;
	 * 	中止当前循环继续下次循环，假设有多个循环嵌套，continue只是中止当前循环本次执行，继续当前循环的下次循环
	 * break;
	 * 	结束当前循环的整个循环,假设有多个循环嵌套，break会结束当前循环的整个循环过程
	 * return;
	 * 	返回整个方法
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	
	public static void main(String[] args) {
		/*
		 * break 与 continue 内容补充
		 */
		// continue , 当j = 2时，中止当前循环，并跳入tag 为 no1 的for循环中，继续这个循环。
		// 结果，输出5次1，当内循环判断为j=2时则中止，继续外循环，外循环又需要进入内循环，再次判断j=2。 共执行5此
		no1: for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j == 2) {
					continue no1;
				}
				System.out.println(j);
			}
			System.out.println("---------------------------");
		}
		System.out.println("分割线-----");
		// 结果，输出1次1，在内循环内判断j=2时结束外循环。
		no2: for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j == 2) {
					break no2;
				}
				System.out.println(j);
			}
			System.out.println("---------------------------");
		}
		System.out.println("~~");
	}
}
