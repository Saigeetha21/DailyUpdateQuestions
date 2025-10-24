package com.cg.day15;

import java.util.HashMap;

public class Histogram {
	private HashMap<Integer, Integer> bins;
	public Histogram() {
		bins = new HashMap<>();
		bins.put(10, 0);
		bins.put(20,0);
		bins.put(30,0);
		bins.put(40,0);
	}
	
	public void addScore(int score) {
		int bin =(score-1)/10*10+10;
		bins.put(bin,bins.get(bin)+1);
	}
	public void displayHistogram() {
		System.out.println("Histogram");
		for(int bin:bins.keySet()) {
			System.out.println(bin+":");
		}
		for(int i=0;i<bins.get(bins);i++) {
			System.out.println("*");
		}
		System.out.println();
	}

}
