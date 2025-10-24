package com.cg.day9;

public class Pizza {
	String size;
	int qnt;
	int price;
	
	public Pizza(String size, int qnt) {
		if(size.equals("Large")) {
			this.price = 200;
		}
		
		else {
			if(size.equals("Medium")) {
				this.price = 100;
			}
			else {
				this.price = 50;
			}
		}
		this.size = size;
		this.qnt = qnt;
	}
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	public int getQnt() {
		return qnt;
	}
	
	public void setQnt(int qnt) {
		this.qnt = qnt;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Pizza [size=" + size + ", qnt=" + qnt + ", price=" + price + "]";
	}
	

}
