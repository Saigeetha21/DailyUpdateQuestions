package com.cg.day1;

public class Course {
	private int cid;
	private String cname;
	private double cfees;
	public Course(int cid, String cname, double cfees) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cfees = cfees;
	}       
	public int getCid() {
		return cid;
	}
	
	public String getCname() {
		return cname;
	}
	public double getCfees() {
		return cfees;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", cfees=" + cfees + "]";
	}

}
