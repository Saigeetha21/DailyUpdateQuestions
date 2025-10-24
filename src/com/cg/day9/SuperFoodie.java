package com.cg.day9;

public class SuperFoodie extends Foodie{
	int disc;
	public SuperFoodie(int fid, String foodieName, String city,long mobileNo, int disc) {
		super(fid, foodieName, city, mobileNo);
		this.disc = disc;
	}
	
	
	public int calculatePrice(Pizza[] p) {
		for(int i=0; i<p.length;i++) {
			totalPrice  += p[i].getQnt()*p[i].getPrice();
		}
		System.out.println(fid + " "+foodieName + " "+city+ " "+ mobileNo);
		return totalPrice - (disc*totalPrice)/100;
	}

}
