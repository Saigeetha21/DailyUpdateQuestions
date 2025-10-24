package com.cg.day8;

public class Driver {
	String Dname;
	int rating;
	public String getDname() {
		return Dname;
	}
	
	public void setDname(String dname) {
		Dname = dname;
	}
	public int getRating() {
		return rating;
	}
	
	public void setRating(int rating) {
		this.rating =  rating;
	}

	@Override
	public String toString() {
		return "Driver [Dname=" + Dname + ", rating=" + rating + "]";
	}
	
	public Driver() {
		super();
	}
	
	public Driver(String dname, int rating) {
		super();
		Dname = dname;
		this.rating = rating;
	}

}
