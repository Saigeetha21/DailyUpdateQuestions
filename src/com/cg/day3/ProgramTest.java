package com.cg.day3;

public class ProgramTest {
	public static void programming(Programlan p) {
		
		if(p instanceof Java)
		{
			Java j =(Java) p;
			j.programming();
		}
		else if(p instanceof Net)
		{
			Net n =(Net) p;
			n.running();
		}
		else {
			Python k = (Python) p;
			k.developing();
		}
	  p.coding();
	  
	  
	  
			
	}

}
