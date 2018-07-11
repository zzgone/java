package com.zzg.例题大全.打印图形;

public class 等腰直角三角形 {

	public static void main(String[] args) {
		int height = 9;
		StringBuffer sb = new StringBuffer();

		for (int i = 1; i <= height; i++) {
			for (int k = 1; k <= 2 * i - 1; k++) {
				if (i == height)
					sb.append("*");
				else if ((k == 1 || k == 2 * i - 1) && i != height)
					sb.append("*");
				else
					sb.append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);

		sb = new StringBuffer();
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= height * 2 - 2 * i; j++) {
				sb.append(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				if (i == height)
					sb.append("*");
				else if ((k == 1 || k == 2 * i - 1) && i != height)
					sb.append("*");
				else
					sb.append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
