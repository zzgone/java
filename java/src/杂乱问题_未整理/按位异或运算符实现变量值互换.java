package 杂乱问题_未整理;


public class 按位异或运算符实现变量值互换 {
	public static void main(String[] args) {

		// 标准
		long a = 100;
		long b = 200;
		a = a ^ b;// a = 172
		b = b ^ a;// b = b ^ 172
		a = a ^ b;// a = 172 ^ b
		
		System.out.println(a);
		System.out.println(b);
		System.out.println();
		
		
		// 小技巧
		// 假设互换值的第二步为:985 ^ 64 = 921
		// 那么a = 921; b = 985;
		System.out.println("假设题  985 ^ 64  结果为：" +  (985 ^ 64));// 921
		
		
		long x = 921;
		long y = 985;
		x = x ^ y;// x = 64.
		y = y ^ x;// y = 921 ,符合小技巧中输出的结果,64这个值也得来了
		x = x ^ y;// x = 985 ,互换成功
		System.out.println(x);
		System.out.println(y);
	}
	
}
