package 打印图形;


public class 直角三角形 {

	// 打印一个 9行的直角三角形

	public static void main(String[] args) {
		String fg = "\n===============================\n";
		int height = 9;

		/*
		 **
		 ***
		 ****
		 *****
		 ******
		 *******/
		for (int i = 0; i < height; i++) {
			for (int j = 0; j <= i; j++) {// i - 1
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println(fg);

		/*******
		 ******
		 *****
		 ****
		 ***
		 **
		 */
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < height - i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println(fg);

		      /*
		      **
		     ***
		    ****
		   *****
		  ******
		 *******/

		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= height - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println(fg);

		/*******
		  ******
		   *****
		    ****
		     ***
		      **
		       */

		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= height - i + 1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println(fg);

		/*
		 **
		 * *
		 *  *
		 *   *
		 *    *
		 *******/
		
		for (int i = 1; i <= height; i++) {
			for (int k = 1; k <= i; ) {
				if(i < 3 || i == height){
					System.out.print("*");
					k++;
				}else {
					System.out.print("*");
					for (int j = 1; j <= i - 2 ; j++) {
						System.out.print(" ");
					}
					System.out.print("*");
					k = i + 1;
				}
			}
			System.out.println("");
		}
		
		System.out.println(fg);
		
		/*******
		 *    *
		 *   *
		 *  *
		 * *
		 **
		 */
		
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= height - i + 1; ) {
				if(i == 1 || i > height - 2 ){
					System.out.print("*");
					j++;
				}
				else {
					System.out.print("*");
					for (int k = 1; k <= height - i - 1; k++) {
						System.out.print(" ");
					}
					System.out.print("*");
					j = height + 1;
				}
			}
			System.out.println("");
		}
		
		System.out.println(fg);
		
		      /*
		      **
		     * *
		    *  *
		   *   *
		  *    *
		 *******/
		
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= height - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; ) {
				if(i < 3 || i == height){
					System.out.print("*");
					j++;
				}else {
					System.out.print("*");
					for (int k = 1; k <= i - 2; k++) {
						System.out.print(" ");
					}
					System.out.print("*");
					j = height + 1;
				}
			}
			System.out.println("");
		}
		
		System.out.println(fg);

		/*******
		  *    *
		   *   *
		    *  *
		     * *
		      **
		       */
		
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= height - i + 1; ) {
				if(i == 1 || i > height - 2){
					System.out.print("*");
					j++;
				}else {
					System.out.print("*");
					for (int k = 1; k <= height - i - 1; k++) {
						System.out.print(" ");
					}
					System.out.print("*");
					j = height + 1;
				}
			}
			System.out.println("");
		}
		
	}
}
