package com.cg.day15;

import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) {
		String string = "Hello , my name is marc";
		int index = StringExercises.findMarc(string);
		System.out.println("findMarc: "+index);
		
		string ="Hello, my name is Marc.";
		String substring = "name";
		index = StringExercises.findSubstring(string, substring);
		System.out.println("findSubstring: "+index);
		
		string ="Hello,my name is Marc.";
		substring ="Marc";
		boolean result = StringExercises.contains(string, substring);
		System.out.println("contains: "+result);
		
		string ="Hello, my name is Marc";
		String[] words = StringExercises.splitIntoWords(string);
		System.out.println("splitIntoWords: "+Arrays.toString(words));
		
		string ="Hello, my name is Marc";
		String firstFour = StringExercises.firstFour(string);
		System.out.println("firstfour: "+firstFour);
		
		string ="Hello, my name is Marc";
		int n=6;
		String firstN = StringExercises.firstN(string, n);
		System.out.println("firstN:"+firstN);
		
		string = "Hello, my name is Marc";
		String lastFour = StringExercises.lastFour(string);
		System.out.println("lastFour: "+lastFour);
		
		string ="Hello, my name is Marc";
		n=5;
		String lastN = StringExercises.lastN(string, n);
		System.out.println("lastN: "+lastN);
		

	}

}
