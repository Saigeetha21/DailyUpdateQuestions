package com.cg.day6;

public class EmployeeTest {
	public static void main(String[] args) {
		PermenantEmp p = new PermenantEmp(100,"geetha", 5000,"clerk",3000);
		Contract c = new Contract(101,"teja", 3000,33);
		p.calculateSal();
		c.calculateSal();
	}

}
