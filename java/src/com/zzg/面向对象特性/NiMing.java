package com.zzg.面向对象特性;

import com.zzg.面向对象特性.接口.YinLiao;

public class NiMing {

	
	public static void main(String[] args) {
		
		YinLiao yl = new YinLiao() {
			
			@Override
			public void rongQi() {
				System.out.println("容器啊啊");
			}
			
			@Override
			public void haoSheng() {
				System.out.println("毫升啊啊");
			}
			
			@Override
			public String getWeiDao() {
				return "好味道";
			}
		};
		
		yl.rongQi();
	}
	
}
