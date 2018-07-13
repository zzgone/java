package com.zzg.����.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest {

	/**
	 * ����ģ��
	 * 
	 * ��ֵ��
	 * K: key
	 * V: value
	 * */
	
	public static void main(String[] args) {

//		List<String>
		
		Map<String, String> map = new HashMap<String, String>();
		
//		������ݴ� add����� put
		map.put("������", "3000��Ǯ");
		map.put("����", "û��Ǯ");
		map.put("����", "�ܶ�Ǯ");
		map.put("��־��", "Ƿһƨ��");
		
		// ��ȡ���� ����key��ȡ�������Ǹ����±��ȡ
		String sunminMoney = map.get("����");
		System.out.println(sunminMoney);
		
		// ɾ��
		map.remove("����");
		System.out.println(map.get("����"));
		
		// ��ѭ��������ݣ���Ҫͨ�� ������ 
		Iterator<Entry<String, String>> iter = map.entrySet().iterator();// ������
		
		while (iter.hasNext()) {// hasNext() ��ʾ �ܲ��ܽ�����һ��ѭ��
			Entry<String, String> entry = iter.next();// next() �õ���һ�� ѭ���� ֵ
			
			// key value ��Ҫ�ֱ��� ������ list ֱ���ó�һ�е�����
			String key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + "\t" + value);
		}
	}
}
