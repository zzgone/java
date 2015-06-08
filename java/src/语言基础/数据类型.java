package ���Ի���;

public class �������� {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/**
		 * ��������(primitive type)�� �� ��  -- ������
		 * 
		 * ����				bit		ȡֵ��Χ													ȡֵ��Χ������ʽ					Ĭ��ֵ		��Ӧ��װ��	��װ��Ĭ��ֵ
		 * boolean(������) 	-		true - false 											-								false		Boolean		
		 * byte(�ֽ�)		8		-128 - 127 												-								0			Byte
		 * char(�ַ���)		16		\u0000 - \uffff 										<Unicode 0 - Unicode 2^16-1>	\u0000		Character
		 * short(������)		16		-32768 - 32767 											<-2^15 - +2^15-1>				0			Short
		 * int(����)			32		-2147483648 - 2147483647 								<-2^31 - +2^31-1>				0			Integer		ȫ��null
		 * folat(������)		32		1.40239846E-45 - 3.40282347E+38 						<IEEE754 - IEEE754>				0.0f		Float
		 * long(������)		64		-9223372036854775808 - 9223372036854775807				<-2^63 - -2^63-1>				0			Long
		 * double(˫����)	64		4.94065645841246544E-324 - 1.79769313486231570E+308		<IEEE754 - IEEE754>				0.0d		Double
		 * 
		 * ~~~ ����BigInteger��BigDecimalû�����Ӧ�Ļ������ͣ���ҪӦ���ڸ߾��ȵ����㣬BigInteger ֧�����⾫�ȵ�������BigDecimal֧�����⾫�ȴ�С��������㡣
		 * 
		 * ������ֵ���ʺ����ڽ�ֹ�����������Ľ��ڼ����С�����System.out.println( 2.0 - 1.1);����ӡ0.899999999999999��������0.9��
		 * ��Ϊ������ֵ���ö�����ϵͳ��ʾ�����������޷���ȷ��ʾ����1/10������ʮ�����޷���ȷ��ʾ1/3һ���������Ҫ����ֵ�����в�������������Ӧ��ʹ��BigDecimal�ࡣ
		 * 
		 * 
		 * �����������װ���͵���ͬ��
		 * 1����Java�У�һ�нԶ��󣬵��˴��������ȴ���Ƕ���
		 * 2��������ʽ�Ĳ�ͬ��������������ͨ��new�ؼ���������������װ������new�ؼ���
		 * 3���洢��ʽ��λ�õĲ�ͬ������������ֱ�Ӵ洢������ֵ�����ڶ�ջ���ܸ�Ч�Ĵ�ȡ����װ������Ҫͨ������ָ��ʵ���������ʵ�������ڶ��С�
		 * 4����ʼֵ�Ĳ�ͬ����װ���͵ĳ�ʼֵΪnull���������͵ĵĳ�ʼֵ�Ӿ�������Ͷ���������int���͵ĳ�ʼֵΪ0��boolean����Ϊfalse
		 * 5��ʹ�÷�ʽ�Ĳ�ͬ�������뼯�������ʹ��ʱֻ��ʹ�ð�װ���͡�
		 * */

		// byte ,�������xyz, ֻ����ֵ��xy. 
		byte x = 18, y = 108, z;
		
		/**
		 * �������Ͱ��� char��byte��short��int��long
		 * ��ע��charΪ�������ͣ����ʾ�ַ��ǿ���������ģ���'A' + 1, �ַ�A������ֵΪ65, ��1��Ϊ 66, ��66�� unicode��ΪB, ����'A' + 1 Ϊ 'B'
		 * */
		char charA = 'A' + 1;//�˷���Ϊ +1 ��ת��Ϊchar����.
		System.out.println(charA);// �� B
		
		char charB = 'B';// �� 67
		System.out.println(charB + 1);//�˷���Ϊ�ó�charB��unicodeֵ�� + 1��Ĭ��תΪint����
		
		
		
		
		/**
		 * ����ƪ �� short �� int ��Ȥ��
		 * */
		short shortA = 10;
		short shortB = 20;
		short shortC = (short) (shortA + shortB);// ��ʱ���֣���Ҫǿ��ת��Ϊ (short)���У��������ΪjavaĬ��������ֵ��ӣ�Ϊint��
		int int_short_A = shortA + shortB;// ����С��int����ֵ�����ʱ�򶼻ᱻ�Զ�ת��Ϊint,Ȼ����м���
		
		// DEMO 1:   �����������ת��Ϊshort��+= �����Ϊ ���������������Ͳ�ͬʱ�������ǿ��ת������
		short shortD = 1;
//		shortD = 1 + shortA; // ������뱨��
		shortD += shortA;
		System.out.println("short d " + shortD);
		
		int intA = 1;
		intA = (int) (1 + 1.1);
		intA += 1.1;
		System.out.println("int a " + intA);
		
		// DEMO 2:   short �� int ռλ�ֽ�����
		int demo2_int_a = 123456;
		short demo2_short_a = (short) demo2_int_a;
		System.out.println(demo2_short_a);// �õ�-7616
		
		/*
		 * DEMO 2 ԭ��
		 * int �� 32 λ��Ҳ��������ܱ�ʾ����Ϊ 32 λ�Ķ�����������
		 * ��һλ�Ƿ���λ����ʾ������0 ��ʾ���ģ�1 ��ʾ���ġ�����λΪ 1��Ϊ����ʱ�������е�λȡ����0 ��� 1��1 ��� 0����Ȼ���� + 1���������������෴����
		 * ȡ������˼���� 0001 0000 1101 1000 = 1110 1111 0010 0111 ~ ���ﲻ���� + 1
		 * 
		 * short �� 16 λ��������intһ��
		 * 123456 ������ int���� 32 λ�ã������Ʊ�ʾΪ 0000 0000 0000 0001 1110 0010 0100 0000
		 * ����ת����short��shortֻ��16λ�����Խ�ȡ��16λ��1110 0010 0100 0000
		 * ������϶�����ԭ���Ǹ����ˣ���λ�� 1����ô���Ǹ�����ȡ����һ�Ժ��� 0001 1101 1100 0000����ת��ʮ���ƾ��� 7616�������෴���������� -7616��
		 * */		
		
		
		/**
		 * ��װ����(Wrapper Class)��ͬ����
		 * */
		
		// {1} ���ð�װ�ഴ������
		Integer itg_a = new Integer(998);
		Double dbl_a = new Double(9.98);

		// {2} �����ַ���������������װ�����Ĺ��캯��.��new Integer("998");
		System.out.println(new Integer("998") + 1);//�� 999
		System.out.println(new Double("9.98") + 1);//�� 10.98
		
		// {3} �����ɶ������ֵ��typeValue����,��obj.intValue(); Ҳ����ת�ɻ�������
		Integer itg_b = 1231;
		int it_b = itg_b.intValue();
		
		// {4} ���ַ���ת��Ϊ����ֵ�� parseType����,��Integer.parseInt("321");
		int it_c = Integer.parseInt("321");
		
		// {5} ���ɹ�ϡ������hashCode����,��obj.hasCode();    
		// hashCode�����Ϊ�������������������ݣ�����Integer abc=100,hashCode��Ϊ100�� ����Student������name��age���ԣ�����Ϊ������18�ꡣ�����student��hashCodeֵΪname=������age=18
		itg_a.hashCode();
		
		// {6} ��ͬһ���������������бȽϵ�equals()����,��obj1.eauqls(obj2);
		itg_a.equals(itg_b);
		
		// {7}�����ַ�����ʾ����toString()����,��obj.toString() ����String����
		itg_a.toString();
		
	}

	
}
