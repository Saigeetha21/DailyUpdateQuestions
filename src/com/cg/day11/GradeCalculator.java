package com.cg.day11;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class GradeCalculator {
	public static LinkedHashMap<String,String>getName(LinkedHashMap<String,Float>hm){
		LinkedHashMap<String,String> res = new LinkedHashMap<String,String>();
		for(Map.Entry<String,Float>map:hm.entrySet()) {
			if(map.getValue()>=60) {
				res.put(map.getKey(), "pass");
			}
			else
				res.put(map.getKey(), "Fail");
			}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		LinkedHashMap<String,Float>hm = new LinkedHashMap<String,Float>();
		for(int i =0; i<n; i++)
		{
			hm.put(in.next(), in.nextFloat());
		}
		LinkedHashMap<String,String> arr = GradeCalculator.getName(hm);
		for(Map.Entry<String,String>map:arr.entrySet()) {
			System.out.println(map.getKey()+"\n"+map.getValue());
		}
	}

}
