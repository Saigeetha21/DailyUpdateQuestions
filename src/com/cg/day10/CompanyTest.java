package com.cg.day10;

public class CompanyTest {

	public static void main(String[] args) {
		Branchoffice b=new Branchoffice(456,"cap","raj","krish",789,"hyd","hyderabad","testing");
		Branchoffice g=new Branchoffice(156,"cap","ram","krish",789,"hyd","hyderabad","development");
		Branchoffice a= new Branchoffice(256,"cap","raji","krish",789,"hyd","hyderabad","production");
		Branchoffice c= new Branchoffice(356,"cap","rocky","krish",789,"hyd","hyderabad","hr team");
		Branchoffice k=new Branchoffice(556,"cap","surya","krish",789,"hyd","hyderabad","development");
		b.display();
		g.display();
		a.display();
		c.display();
		k.display();

	}

}
