package com.cg.intef;
import java.io.*;

public class Employee {
	int salary = 6000;

}
class Engineer extends Employee {
	int benefits = 10000;
}
class Gfg {
	public static void main(String args[]) {
		Engineer E1 = new Engineer();
		System.out.println("Salary :"+E1.salary + "\nBenefits :"+E1.benefits);
	}
}
