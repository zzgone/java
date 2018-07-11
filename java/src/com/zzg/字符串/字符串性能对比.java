package com.zzg.字符串;

public class 字符串性能对比 {

	/**
	 * 使用策略
	 * （1）基本原则：如果要操作少量的数据，用String ；单线程操作大量数据，用StringBuilder ；多线程操作大量数据，用StringBuffer。
	 * （2）不要使用String类的"+"来进行频繁的拼接，因为那样的性能极差的，应该使用StringBuffer或StringBuilder类，这在Java的优化上是一条比较重要的原则。
	 * （3）为了获得更好的性能，在构造 StirngBuffer 或 StirngBuilder 时应尽可能指定它们的容量。当然，如果你操作的字符串长度（length）不超过 16 个字符就不用了，
	 * 		当不指定容量（capacity）时默认构造一个容量为16的对象。不指定容量会显著降低性能。
	 * （4）StringBuilder一般使用在方法内部来完成类似"+"功能，因为是线程不安全的，所以用完以后可以丢弃。StringBuffer主要用在全局变量中
	 * （5）相同情况下使用 StirngBuilder 相比使用 StringBuffer 仅能获得 10%~15% 左右的性能提升，但却要冒多线程不安全的风险。而在现实的模块化编程中，
	 * 		负责某一模块的程序员不一定能清晰地判断该模块是否会放入多线程的环境中运行，因此：除非确定系统的瓶颈是在 StringBuffer 上，并且确定你的模块不会运行在多线程模式下，
	 * 		才可以采用StringBuilder；否则还是用StringBuffer。
	 * */
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String str = "";
		//循环开始时间
		long starTime = System.currentTimeMillis();
		//循环10万次 ... 十万次接近20秒。 1000W次不敢想
//		for (int i = 0; i < 100000; i++) {
//			str = str + i;
//		}
		//循环结束时间
		long endTime = System.currentTimeMillis();
		long time = endTime - starTime;
		System.out.println("String循环10W次用时" + time + "毫秒");
		
		
		
		StringBuilder builder = new StringBuilder();
		starTime = System.currentTimeMillis();
		for (long i = 0; i < 10000000; i++) {
			builder.append(i);
		}
		endTime = System.currentTimeMillis();
		time = endTime - starTime;
		System.out.println("StringBuilder循环1000W次用时" + time + "毫秒");
		
		
		StringBuffer buff = new StringBuffer();
		starTime = System.currentTimeMillis();
		for (long i = 0; i < 10000000; i++) {
			buff.append(i);
		}
		endTime = System.currentTimeMillis();
		time = endTime - starTime;
		System.out.println("StringBuffer循环1000W次用时" + time + "毫秒");
	}
	
	
}
