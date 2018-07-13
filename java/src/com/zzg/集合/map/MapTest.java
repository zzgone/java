package com.zzg.集合.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest {

	/**
	 * 数据模型
	 * 
	 * 键值对
	 * K: key
	 * V: value
	 * */
	
	public static void main(String[] args) {

//		List<String>
		
		Map<String, String> map = new HashMap<String, String>();
		
//		添加数据从 add变成了 put
		map.put("林智勇", "3000块钱");
		map.put("孙敏", "没有钱");
		map.put("张琪", "很多钱");
		map.put("张志刚", "欠一屁股");
		
		// 获取数据 根据key获取，而不是根据下标获取
		String sunminMoney = map.get("孙敏");
		System.out.println(sunminMoney);
		
		// 删除
		map.remove("张琪");
		System.out.println(map.get("张琪"));
		
		// 想循环输出数据，需要通过 迭代器 
		Iterator<Entry<String, String>> iter = map.entrySet().iterator();// 迭代器
		
		while (iter.hasNext()) {// hasNext() 表示 能不能进行下一次循环
			Entry<String, String> entry = iter.next();// next() 拿到这一次 循环的 值
			
			// key value 需要分别拿 而不像 list 直接拿出一行的数据
			String key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + "\t" + value);
		}
	}
}
