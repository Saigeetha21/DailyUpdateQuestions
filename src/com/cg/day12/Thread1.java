package com.cg.day12;

public class Thread1 extends Thread{
	
	public Thread1(String str) {
		setName(str);
	}
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(getName()+" "+i+" "+isAlive());
			try { sleep(1000);}
			  catch(Exception e) {}
	}

	}
	
}
