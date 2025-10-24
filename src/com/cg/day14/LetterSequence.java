package com.cg.day14;

import java.util.TreeMap;

public class LetterSequence {
	private String sentence;
	
	public LetterSequence(String sentence) {
		this.sentence = sentence;
	}
	
	public TreeMap<Character, Integer> computerFrequency() {
		TreeMap<Character,Integer> frequencyMap = new TreeMap<>();
		for (int i=0; i<sentence.length();i++) {
			char c = sentence.charAt(i);
			if(c != ' ') {
				frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) +1);
				
			}
		} 
		return frequencyMap;
		
	}
	public void displayLetterFrequency(TreeMap<Character, Integer>frequencyMap) {
		for (char c : frequencyMap.keySet()) {
			System.out.println(c + " :");
			for (int i =0; i<frequencyMap.get(c); i++) {
				System.out.println("*");
				
			}
			System.out.println();
		}
	}

}
