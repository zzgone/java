package com.zzg.流程控制.循环;

public class 循环的结束跳转 {

	/**
	 * continue 继续 - 结束本次循环，进行下一次循环
	 * break 结束 - 结束当前整个循环
	 * return 返回 - 结束整个方法 包括循环
	 * */
	public static void main(String[] args) {
		
		for (int i = 1; i <= 9; i++) {
			
			System.out.println("执行了一次循环， 当前是第" + i + "次循环");
			
			if (i == 3) {
				System.out.println("continue啦");
				continue;
			}
			
			if (i == 5) {
				System.out.println("一切都结束了");
				return;
			}
			
			if (i == 8) {
				System.out.println("退出了整个循环！！！");
				break;
			}
			
			
			System.out.println("循环结束~~~~");
		}
		
		
		System.out.println("asdkljaskljdkasjdkasjdklajskdlaskljd");
	}
}
