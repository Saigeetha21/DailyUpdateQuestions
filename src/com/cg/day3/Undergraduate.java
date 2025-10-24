package com.cg.day3;

public class Undergraduate extends Student{
	public Undergraduate(String s) {
		super(s);
	}
public void generateResult() {
	int []s=this.getTest();
	int total=0;
	
	for(int i=0;i<s.length;i++) {
		total=total+s[i];
	}
	int avg=total/s.length;
	if(avg>60) {
		this.setResult("pass");
	}
	else {
		this.setResult("Fail");
	}
	System.out.println("Name="+this.getName());
	System.out.println("scores");
	for(int i=0;i<s.length;i++) {
		System.out.println(s[i]);
		
	}
	System.out.println("Result :"+this.getResult());
}

}
