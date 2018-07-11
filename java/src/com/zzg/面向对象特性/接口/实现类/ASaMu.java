package com.zzg.面向对象特性.接口.实现类;

import com.zzg.面向对象特性.接口.YinLiao;

/**
 * 一个类实现了一个标准（接口）
 * */
public class ASaMu implements YinLiao {

	@Override
	public void rongQi() {
		System.out.println("瓶子");
	}

	@Override
	public void haoSheng() {
		System.out.println("500毫升");
	}

	@Override
	public String getWeiDao() {
		return "阿萨姆味";
	}

	public static void main(String[] args) {
		YinLiao yl = new ASaMu();
		yl.rongQi();
		
		ASaMu asm = new ASaMu();
		asm.rongQi();
	}
	
}
