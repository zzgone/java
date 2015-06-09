package 打印;

public class 长方形 {

	// 打印 9*7的长方形 -- 空心
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
//		int width = height * 2;//正方形
//		int width = height * 3;//扁的长方形
		
		// 高
		for (int i = 0; i < height; i++) {
			System.out.print("*");
			// 宽
			for (int j = 0; j < width -2; j++) {// widht-2 为去掉两边用*填充的单位
				if(i == 0 || i == height -1){//i=0 为第一行  ,i = height-1 为最后一行
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("*");
		}
		
		
		System.out.println("--------------------------------");
		
		/* 实心
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
