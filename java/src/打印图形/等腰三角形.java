package ��ӡͼ��;

public class ���������� {


	public static void main(String[] args) {
		String fg = "\n===============================\n";
		int height = 9;
		
		    /*
		    ***
		   *****
		  *******
		 *********/
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= height - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) { // 2*i-1
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println(fg);
		
	        /*
		    * *
		   *   *
		  *     *
		 *********/

		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= i - 1 + height; j++) {
				// if ((j >= height - i + 1 && j <= height + i - 1) || i == height)// ʵ��
				if (j == height - i + 1 || j == height + i - 1 || i == height)// ����
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
		
		System.out.println(fg);
		
	    	/*
	    	***
	       *****
	      *******
	     *********/
		//�ڶ��ַ�ʽ
		
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= i - 1 + height; j++) {
				if ((j >= height - i + 1 && j <= height + i - 1) || i == height)// ʵ��
				//if (j == height - i + 1 || j == height + i - 1 || i == height)// ����
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
		
		System.out.println(fg);
		
		/*********
		  *******
		   *****
		    ***
		     */
		
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for (int z = 0; z < height * 2 - 2 * i + 1; z++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
