package �ַ�������;

public class �ַ������� {

	/**
	 * �ַ����ķǿ�У��Ҫ�����ж��ַ����Ƿ�=null
	 * 
	 * */
	
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String str = "   we are students ha 1 ha 2 ha 3 ha 4  ";
		
		System.out.println(str.length());
		
		//ȥ���ַ��� ���ҿո�
		System.out.println(str.trim());
		
		//ȥ���ַ��� ���пո�
		System.out.println(str.replaceAll(" ", ""));
		
		//�滻�����ظ����ַ�
		System.out.println(str.replace("ha", "@"));
		
		//�滻��һ���ظ����ֵ��ַ�
		System.out.println(str.replaceFirst("ha", "@"));
		
		//�滻�ڶ����ظ����ֵ��ַ�                          ��ʵ��
		String str2 = str.substring(0, str.indexOf("ha") + 2);
		String str3 = str.substring(str.indexOf("ha") + 2);
		str2 += str3.replaceFirst("ha", "@");
		System.out.println(str2);
				
		//�滻���һ���ظ����ֵ��ַ�
		StringBuffer sb2 = new StringBuffer(str);
		System.out.println(sb2.replace(sb2.lastIndexOf("ha"), sb2.lastIndexOf("ha") + 2, "@"));// ��startλ����endλ�滻Ϊ !
		
		
		/**
		 * �ַ����Ƚ�
		 * */
		String a = "ChaoJiDaShaBi";
		String b = new String("ChaoJiDaShaBi");
		String c = new String("ChaoJiDaShaBi");
		String d = new String("chaojidashabi");
		String e = b;
		
		// �Ƚ��ַ��� �� �����ִ�Сд
		System.out.println(a.equalsIgnoreCase("chaojidashabi"));// true
		
		System.out.println(a == "ChaoJiDaShaBi");// true ԭ����Ϊ a ָ���ֻ��һ�� ChaoJiDaShaBi ���ַ�����
		System.out.println(b == "ChaoJiDaShaBi");// false ԭ����Ϊ b ָ�����һ���ַ������󣬸ö���������ڴ��У�==�Ƚϵ����ڴ��еĴ�ŵ�ַ
		System.out.println(b == c);// false ͬ�� ,����new String ����ڴ��ַ��ͬ�� ��֤�� ���Դ�������Studen�࣬����ͬ�����ԡ�����sysoֱ�Ӵ�ӡ���������������ܿ������ǵ��ڴ��ַʵ�����ǲ�һ����
		System.out.println(b.equals(c));// true  equals�����Ƚ���������ֵ�Ƿ����
		System.out.println(b == e);// true e ָ����� b �� new�Ķ����ŵ�ַ
		
		
		/**
		 * �ж��ַ����Ŀ�ʼ���β�Ƿ���ָ������
		 * */
		String se = "thc wbsc.lls-snapshot";
		// ��ʼ
		System.out.println(se.startsWith("thc "));
		// ��β
		System.out.println(se.endsWith("-snapshot"));
		
		
		/**
		 * ��Сдת��
		 * */
		String dxx = "HA shabi";
		// ȫ��ת���ɴ�д
		System.out.println(dxx.toUpperCase());
		// ȫ��ת����Сд
		System.out.println(dxx.toLowerCase());
		
		
		/**
		 * �ַ����ָ�
		 * */
		String fg = "a,b,c,d,e,f,g";
		String fgArray[] = fg.split(",");
		for (String fgarr : fgArray) {
			System.out.println(fgarr);
		}
		
		//�ָ��3��
		String fgArray2[] = fg.split(",", 3);
		for (String fgarr : fgArray2) {
			System.out.println(fgarr);
		}
		
		/**
		 * �ַ�����ʽ����������ٶȣ�̫���ˣ�
		 * 1.������ʽ�������Ĵ�д��100
		 * 2.��ʱ���ʽ��
		 * 3.�����ָ�ʽ���ɻ��Ҹ�ʽ
		 * */
	}
}
