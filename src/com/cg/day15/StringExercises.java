package com.cg.day15;

public class StringExercises {
	public static int findMarc(String string) {
		return string.indexOf("Marc");
	}
	
	public static int findSubstring(String string,String substring) {
		return string.indexOf(substring);
	}
	public static boolean contains(String string, String substring) {
		return string.contains(substring);
	}
	public static String[] splitIntoWords(String string) {
		return string.split("//s+");
	}
	public static String firstFour(String string) {
		return string.substring(0,4);
	}
	public static String firstN(String string, int n) {
		return string.substring(0,n);
	}
	public static String lastFour(String string) {
		return string.substring(string.length() -4);
	}
	public static String lastN(String string , int n) {
		return string.substring(string.length() -n);
	}

}
