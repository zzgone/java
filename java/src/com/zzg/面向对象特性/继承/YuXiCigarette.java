package com.zzg.面向对象特性.继承;

import com.zzg.面向对象特性.抽象.Cigarette;

public class YuXiCigarette extends Cigarette {

	public void yanwei() {
		System.out.println("玉溪烟味");
	}

	@Override
	public void price() {
		System.out.println("玉溪25块钱");
	}

}
