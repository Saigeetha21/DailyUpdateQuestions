package com.cg.day9;

public class UltraFoodie extends Foodie{
	int reward;
	public UltraFoodie(int fid, String foodieName, String city, long mobileNo, int reward) {
		super(fid, foodieName, city, mobileNo);
		this.reward = reward;
	}
	
	public int calculatePrice(Pizza[] p) {
		for(int i = 0; i<p.length;i++) {
			totalPrice += p[i].getQnt()*p[i].getPrice();
		}
		System.out.println(fid + " "+ foodieName + " "+city+ " "+mobileNo);
		return totalPrice-reward;
	}
	
	
	

}
