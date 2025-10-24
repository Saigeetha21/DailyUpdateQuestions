package com.cg.day16;
//using command line arguments
public class BattingAg {
	public static void main(String args[]) {
		double mat,inn,notout,avg,run;
		mat=Double.parseDouble(args[0]);
		inn=Double.parseDouble(args[1]);
		notout=Double.parseDouble(args[2]);
		run=Double.parseDouble(args[3]);
		System.out.println("Matches="+(long)mat);
		System.out.println("Innings="+(long)inn);
		System.out.println("NotOut="+(long)notout);
		System.out.println("Total runs="+(long)+run);
		if(inn<=mat&&notout<=inn) {
			avg=run/(inn-notout);
			System.out.println("batting avg="+avg);
		}
		
		else
		{
			System.out.println("please enter innings<=matches and notout<=innings");
		}
	}

}
