package com.cg.day7;

public class InstrumentTest {
	public static void main(String[] args) {
		Instrument[] a = new Instrument[10];
		a[0]=new Piano();
		a[1]=new Flute();
		a[2]=new Guitar();
		a[3]=new Piano();
		a[4]=new Flute();
		a[5]=new Guitar();
		a[6]=new Piano();
		a[7]=new Flute();
		a[8]=new Guitar();
		a[9]=new Piano();
		for(int i=0;i<a.length;i++) 
		{
			if(a[i] instanceof Piano)
			{
				System.out.println("Index of Piano is"+" "+(i+1));
				a[i].play();
				System.out.println("piano is playing tan tan tan");
			}
			
			if(a[i] instanceof Flute)
			{
				System.out.println("Index of Flute is"+" "+(i+1));
				a[i].play();
				System.out.println("flute is playing tak tak tak");
			}
			
			if(a[i] instanceof Guitar)
			{
				System.out.println("Index of Guitar is "+" "+(i+1));
				a[i].play();
				System.out.println("guitar is playing");
			}
		}
		
	}

}
