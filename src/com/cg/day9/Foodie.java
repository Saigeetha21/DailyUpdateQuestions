package com.cg.day9;

public class Foodie {
	int fid;
	String foodieName;
	String city;
	long mobileNo;
	int totalPrice;
	
	public Foodie(int fid, String foodieName, String city, long mobileNo) {
		this.fid = fid;
		this.foodieName = foodieName;
		this.city = city;
		this.mobileNo = mobileNo;
		
		
		
	}
	public int calculatePrice(Pizza[] p) {
		for(int i =0; i<p.length;i++) {
			totalPrice = totalPrice+ p[i].getQnt()*p[i].getPrice();
			
		}
		System.out.println(fid+ " "+foodieName+ " " +city+ " "+mobileNo);
		return totalPrice;
	}

}
