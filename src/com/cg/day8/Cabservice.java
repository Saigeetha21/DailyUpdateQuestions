package com.cg.day8;

public class Cabservice {
	String servicename;
	int totalcabs;
	
	public String getServicename() {
		return servicename;
	}
	
	public void setServicename(String servicename) {
		this.servicename = servicename;
	}
	
	public int getTotalcabs() {
		return totalcabs;
	}
	
	public void setTotalcabs(int totalcabs) {
		this.totalcabs = totalcabs;
	}
	
	public Cabservice() {
		
	}
	
	public Cabservice(String servicename, int totalcabs) {
		super();
		this.servicename = servicename;
		this.totalcabs = totalcabs;
	}
	
	public void drating(Driver d) {
		if(d.getRating()>4.5) {
			System.out.println("platinum");
		}else if(d.getRating()>3.5) {
			System.out.println("Gold");
		}
	}

}
