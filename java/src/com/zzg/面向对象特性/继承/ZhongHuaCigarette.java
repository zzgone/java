package com.zzg.面向对象特性.继承;

import com.zzg.面向对象特性.抽象.Cigarette;

public class ZhongHuaCigarette extends Cigarette {

	public void yanwei() {
		System.out.println("中华烟味");
	}

	@Override
	public void price() {
		System.out.println("中华45元");
	}

}
