package com.cg.day12;

public class Thread2 extends Thread{
	
	public Thread2(String str) {
		setName(str);
	}
	
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(getName()+" "+i+" "+isAlive());
			try {sleep(1000);}
			catch(Exception e){}
	}
		

		
  }
}
