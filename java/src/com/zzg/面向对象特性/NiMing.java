package com.zzg.�����������;

import com.zzg.�����������.�ӿ�.YinLiao;

public class NiMing {

	
	public static void main(String[] args) {
		
		YinLiao yl = new YinLiao() {
			
			@Override
			public void rongQi() {
				System.out.println("��������");
			}
			
			@Override
			public void haoSheng() {
				System.out.println("��������");
			}
			
			@Override
			public String getWeiDao() {
				return "��ζ��";
			}
		};
		
		yl.rongQi();
	}
	
}
