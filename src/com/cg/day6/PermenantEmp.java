package com.cg.day6;

public class PermenantEmp extends Employee{
	String designation;
	int hikeInsal;
	public PermenantEmp(int empid, String ename, int sal, String designation, int hikeInsal) {
		super(empid,ename,sal);
		this.designation=designation;
		this.hikeInsal=hikeInsal;
		
	}
	public void calculateSal() {
		sal+=hikeInsal;
		System.out.println(empid+" "+ename+ " "+ sal + " "+designation+" "+hikeInsal);
	}

}
