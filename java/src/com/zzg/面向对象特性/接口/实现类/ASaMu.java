package com.zzg.�����������.�ӿ�.ʵ����;

import com.zzg.�����������.�ӿ�.YinLiao;

/**
 * һ����ʵ����һ����׼���ӿڣ�
 * */
public class ASaMu implements YinLiao {

	@Override
	public void rongQi() {
		System.out.println("ƿ��");
	}

	@Override
	public void haoSheng() {
		System.out.println("500����");
	}

	@Override
	public String getWeiDao() {
		return "����ķζ";
	}

	public static void main(String[] args) {
		YinLiao yl = new ASaMu();
		yl.rongQi();
		
		ASaMu asm = new ASaMu();
		asm.rongQi();
	}
	
}
