package com.zzg.�����������;

import com.zzg.�����������.����.Cigarette;
import com.zzg.�����������.�̳�.BaiShaCigarette;
import com.zzg.�����������.�̳�.YuXiCigarette;
import com.zzg.�����������.�̳�.ZhongHuaCigarette;

public class Test {

	
	public static void main(String[] args) {
		// ���� �� �����Ʒ���� ���� �� �� ��ϵ
		
		// ���� new ��ɳ��
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
