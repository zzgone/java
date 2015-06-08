package 语言基础;

public class 数据类型 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/**
		 * 基本类型(primitive type)有 ８ 种  -- 待更改
		 * 
		 * 类型				bit		取值范围													取值范围简易形式					默认值		对应包装类	包装类默认值
		 * boolean(布尔型) 	-		true - false 											-								false		Boolean		
		 * byte(字节)		8		-128 - 127 												-								0			Byte
		 * char(字符型)		16		\u0000 - \uffff 										<Unicode 0 - Unicode 2^16-1>	\u0000		Character
		 * short(短整型)		16		-32768 - 32767 											<-2^15 - +2^15-1>				0			Short
		 * int(整型)			32		-2147483648 - 2147483647 								<-2^31 - +2^31-1>				0			Integer		全是null
		 * folat(浮点型)		32		1.40239846E-45 - 3.40282347E+38 						<IEEE754 - IEEE754>				0.0f		Float
		 * long(长整型)		64		-9223372036854775808 - 9223372036854775807				<-2^63 - -2^63-1>				0			Long
		 * double(双精度)	64		4.94065645841246544E-324 - 1.79769313486231570E+308		<IEEE754 - IEEE754>				0.0d		Double
		 * 
		 * ~~~ 其中BigInteger、BigDecimal没有相对应的基本类型，主要应用于高精度的运算，BigInteger 支持任意精度的整数，BigDecimal支持任意精度带小数点的运算。
		 * 
		 * 浮点数值不适合用于禁止出现舍入误差的金融计算中。例如System.out.println( 2.0 - 1.1);将打印0.899999999999999，而不是0.9。
		 * 因为浮点数值采用二进制系统表示，而二进制无法精确表示分数1/10，就像十进制无法精确表示1/3一样。如果需要在数值计算中不含有舍入误差，就应该使用BigDecimal类。
		 * 
		 * 
		 * 基本类型与包装类型的异同：
		 * 1、在Java中，一切皆对象，但八大基本类型却不是对象。
		 * 2、声明方式的不同，基本类型无需通过new关键字来创建，而封装类型需new关键字
		 * 3、存储方式及位置的不同，基本类型是直接存储变量的值保存在堆栈中能高效的存取，封装类型需要通过引用指向实例，具体的实例保存在堆中。
		 * 4、初始值的不同，封装类型的初始值为null，基本类型的的初始值视具体的类型而定，比如int类型的初始值为0，boolean类型为false
		 * 5、使用方式的不同，比如与集合类合作使用时只能使用包装类型。
		 * */

		// byte ,定义变量xyz, 只赋初值给xy. 
		byte x = 18, y = 108, z;
		
		/**
		 * 整数类型包括 char、byte、short、int、long
		 * 请注意char为整数类型，这表示字符是可用于运算的，如'A' + 1, 字符A的整数值为65, 加1后为 66, 而66的 unicode码为B, 所以'A' + 1 为 'B'
		 * */
		char charA = 'A' + 1;//此方法为 +1 后转换为char类型.
		System.out.println(charA);// 得 B
		
		char charB = 'B';// 得 67
		System.out.println(charB + 1);//此方法为得出charB的unicode值后 + 1，默认转为int类型
		
		
		
		
		/**
		 * 话外篇 ： short 与 int 的趣事
		 * */
		short shortA = 10;
		short shortB = 20;
		short shortC = (short) (shortA + shortB);// 此时发现，需要强制转换为 (short)才行，这个是因为java默认两个数值相加，为int型
		int int_short_A = shortA + shortB;// 精度小于int的数值运算的时候都会被自动转换为int,然后进行计算
		
		// DEMO 1:   利用运算符，转换为short，+= 运算符为 左右两边数据类型不同时，会进行强制转换操作
		short shortD = 1;
//		shortD = 1 + shortA; // 这里编译报错
		shortD += shortA;
		System.out.println("short d " + shortD);
		
		int intA = 1;
		intA = (int) (1 + 1.1);
		intA += 1.1;
		System.out.println("int a " + intA);
		
		// DEMO 2:   short 与 int 占位字节问题
		int demo2_int_a = 123456;
		short demo2_short_a = (short) demo2_int_a;
		System.out.println(demo2_short_a);// 得到-7616
		
		/*
		 * DEMO 2 原因
		 * int 是 32 位，也就是最多能表示长度为 32 位的二进制整数。
		 * 第一位是符号位，表示正负，0 表示正的，1 表示负的。当首位为 1（为负）时，把所有的位取反（0 变成 1，1 变成 0），然后再 + 1，就是它的正数相反数。
		 * 取反的意思即： 0001 0000 1101 1000 = 1110 1111 0010 0111 ~ 这里不包括 + 1
		 * 
		 * short 是 16 位，其他与int一样
		 * 123456 本来是 int，有 32 位置，二进制表示为 0000 0000 0000 0001 1110 0010 0100 0000
		 * 而后转换成short，short只有16位，所以截取后16位，1110 0010 0100 0000
		 * 这个数肯定不是原来那个数了，首位是 1，那么就是负数，取反加一以后是 0001 1101 1100 0000，这转成十进制就是 7616，这是相反数，所以是 -7616。
		 * */		
		
		
		/**
		 * 包装类型(Wrapper Class)共同方法
		 * */
		
		// {1} 利用包装类创建对象
		Integer itg_a = new Integer(998);
		Double dbl_a = new Double(9.98);

		// {2} 带有字符串参数并创建包装类对象的构造函数.如new Integer("998");
		System.out.println(new Integer("998") + 1);//得 999
		System.out.println(new Double("9.98") + 1);//得 10.98
		
		// {3} 可生成对象基本值的typeValue方法,如obj.intValue(); 也就是转成基本类型
		Integer itg_b = 1231;
		int it_b = itg_b.intValue();
		
		// {4} 将字符串转换为基本值的 parseType方法,如Integer.parseInt("321");
		int it_c = Integer.parseInt("321");
		
		// {5} 生成哈稀表代码的hashCode方法,如obj.hasCode();    
		// hashCode我理解为是这个对象最基本的数据，比如Integer abc=100,hashCode就为100， 比如Student对象有name和age属性，设置为张三，18岁。既这个student的hashCode值为name=张三，age=18
		itg_a.hashCode();
		
		// {6} 对同一个类的两个对象进行比较的equals()方法,如obj1.eauqls(obj2);
		itg_a.equals(itg_b);
		
		// {7}生成字符串表示法的toString()方法,如obj.toString() 返回String对象
		itg_a.toString();
		
	}

	
}
