package ���Ի���;

import java.util.Arrays;

public class ���� {

	/**
	 * ����ûʲô�üǵ�
	 * 
	 * */
	public static void main(String args[]) {
		
		int num [] = {9,5,3,55,951,1};
		int min = num[0];
		for (int i = 0; i < num.length - 1; i++) {
			if(min > num[i +1]){
				min = num[i + 1];
			}
		}
		System.out.println(min);
		
		// ���ֵ pram˳�����á�1.��Ҫ�������� 2.�������ĸ��±꿪ʼ 3.�������ĸ��±���� 3.��Ҫ����ֵ
		Arrays.fill(num, num.length - 1,num.length, 0);
		for (int i : num) {
			System.out.println(i);
		}
	}
}
