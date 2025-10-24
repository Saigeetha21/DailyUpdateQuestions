package com.cg.day6;

public class Contract extends Employee {
	private int servicePeriod;
	
	public Contract(int empid, String ename, int sal, int servicePeriod) {
		super(empid, ename, sal);
		this.servicePeriod = servicePeriod;
	}
	
	public void calculateSal() {
		if(servicePeriod >= 30)
			sal+= 20000;
		System.out.println(empid + " " + ename + " " + sal + " "+servicePeriod);
	}
	
	

}
