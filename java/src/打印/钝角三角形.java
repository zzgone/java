package ´òÓ¡;

public class ¶Û½ÇÈý½ÇÐÎ {

	public static void main(String[] args) {
		int height = 9;
		
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
