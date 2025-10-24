package com.cg.day10;

public class CoachTest {

	public static void main(String[] args) {
		Coach []c = new Coach[3];
		c[0] = new LuggageCoach();
		c[1] = new GeneralCoach();
		c[2] = new LadiesCoach();
		for(int i=0;i<c.length;i++)
		{
			if(c[i] instanceof LuggageCoach) {
				System.out.println("LuggageCoach is stored in the "+i+ "Location");
			}
			else if(c[i] instanceof GeneralCoach) {
				System.out.println("GeneralCoach is stored in the "+i+ "Location");
			}
			else
				System.out.println("LadiesCoach is stored in the "+i+ "Location");
		}

	}

}
