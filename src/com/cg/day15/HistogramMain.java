package com.cg.day15;

import java.util.Scanner;

public class HistogramMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numScores = sc.nextInt();
		Histogram histogram = new Histogram();
		for(int i=0;i<numScores;i++) {
			int score = sc.nextInt();
			histogram.addScore(score);
		}
		histogram.displayHistogram();
		

	}

}
