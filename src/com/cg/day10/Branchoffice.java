package com.cg.day10;

public class Branchoffice extends Company{
	int brid;
	String bname;
	String location;
	String dept;
	public Branchoffice(int cid, String cname, String ho, String ceo, int brid, String bname, String location,String dept) {
		super(cid,cname,ho,ceo);
		this.brid = brid;
		this.bname = bname;
		this.location = location;
		this.dept = dept;
	}
	
	public void display() {
		System.out.println("Branch name="+bname+" "+"BranchId="+brid+"companyname="+cname+" "+" "+"Companylocation="+location+"");
	}

}
