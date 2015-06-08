package 语言基础;

import java.util.Arrays;

public class 数组 {

	/**
	 * 数组没什么好记的
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
		
		// 填充值 pram顺序，作用。1.需要填充的数组 2.从数组哪个下标开始 3.到数组哪个下标结束 3.需要填充的值
		Arrays.fill(num, num.length - 1,num.length, 0);
		for (int i : num) {
			System.out.println(i);
		}
	}
}
