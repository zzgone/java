package ��ӡ;

public class ������ {

	// ��ӡ 9*7�ĳ����� -- ����
	/*******
	 *     *
	 *     *
	 *     *
	 *     *
	 *     *
	 *     *
	 *******/
	public static void main(String[] args) {
		int height = 9;
		int width = 7;
//		int width = height * 2;//������
//		int width = height * 3;//��ĳ�����
		
		// ��
		for (int i = 0; i < height; i++) {
			System.out.print("*");
			// ��
			for (int j = 0; j < width -2; j++) {// widht-2 Ϊȥ��������*���ĵ�λ
				if(i == 0 || i == height -1){//i=0 Ϊ��һ��  ,i = height-1 Ϊ���һ��
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("*");
		}
		
		
		System.out.println("--------------------------------");
		
		/* ʵ��
		*******
		*******
		*******
		*******
		*******
		*******
		*******
		*******
		*******
		*/
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
