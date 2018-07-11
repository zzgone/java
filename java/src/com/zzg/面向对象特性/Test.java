package com.zzg.面向对象特性;

import com.zzg.面向对象特性.抽象.Cigarette;
import com.zzg.面向对象特性.继承.BaiShaCigarette;
import com.zzg.面向对象特性.继承.YuXiCigarette;
import com.zzg.面向对象特性.继承.ZhongHuaCigarette;

public class Test {

	
	public static void main(String[] args) {
		// 香烟 跟 具体的品牌烟 属于 父 子 关系
		
		// 烟类 new 白沙烟
		Cigarette c = new BaiShaCigarette();
		c.yanwei();
		c.price();
		
		BaiShaCigarette bsc = new BaiShaCigarette();
		bsc.testwwww();
		
		
		Cigarette c2 = new YuXiCigarette();
		c2.yanwei();
		c2.price();
		
		Cigarette c3 = new ZhongHuaCigarette();
		c3.yanwei();
		c3.price();
		
	}
	
}
