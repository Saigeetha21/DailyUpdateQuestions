package com.cg.day8;

public class ProductOne {
	int pid;
	String pName;
	int prate;
	public ProductOne(int pid, String pName, int prate) {
		super();
		this.pid = pid;
		this.pName = pName;
		this.prate = prate;
	}
	public ProductOne() {
		super();
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrate() {
		return prate;
	}
	public void setPrate(int prate) {
		this.prate = prate;
    }
	@Override
	public String toString() {
		return "ProductOne [pid=" + pid + ", pName=" + pName + ", prate=" + prate + "]";
	}
	
	
	public boolean equals(Object obj) {
		ProductOne p =(ProductOne)obj;
		if(this.pid==p.getPid()&&this.pName==p.getpName()&&this.prate==p.getPrate())
			return true;
		return false;
		
	}
	
}