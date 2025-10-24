package com.cg.day11;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class CalculateAverage {
	
	public static double sizeOfResultandHashMap(HashMap<Integer,Float>hm) {
		int k,count =0;
		float sum = 0.0f;
		DecimalFormat f = new DecimalFormat("#.00");
		       Iterator<Integer> i = hm.keySet().iterator();
		       while(i.hasNext()) {
		    	   k=i.next();
		    	   if(k%2==0) {
		    		   sum = sum+hm.get(k);
		    		   count++;
		    	   }
		    		   
		       }
		       float d = sum/count;
		       String str = f.format(d);
		       float d1 = Float.parseFloat(str);
	  return d1;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		HashMap<Integer,Float> hm = new HashMap<Integer, Float>();
		for(int i=0;i<n;i++) {
			hm.put(in.nextInt(), in.nextFloat());
		}
		System.out.println(CalculateAverage.sizeOfResultandHashMap(hm));
	}

}
