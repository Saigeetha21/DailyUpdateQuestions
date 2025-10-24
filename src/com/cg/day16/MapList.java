package com.cg.day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		map.put(5, "e");
		
		List<Integer> keyList = new ArrayList(map.keySet());
		List<String> value = new ArrayList(map.values());
		
		System.out.println("the key set values are:" +keyList);
		System.out.println("the values are:"+value);
		
	
		//System.out.println("the map values are:"+map);
  }
}
