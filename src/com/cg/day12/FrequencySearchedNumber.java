package com.cg.day12;

public class FrequencySearchedNumber {
	static int frequencyOfNumber(int arr[],int m, int n) {
		int a=0;
		for(int i=0;i<n;i++)
			if(m==arr[i])
				a++;
		return a;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,4,2,3,5,4,6,7,8,9,5};
		int n =arr.length;
		
		int m=8;
		System.out.println(FrequencySearchedNumber.frequencyOfNumber(arr, m, n));
	}

}
