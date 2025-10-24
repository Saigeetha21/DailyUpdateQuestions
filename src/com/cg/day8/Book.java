package com.cg.day8;

public class Book {
	int bid;
	String bname;
	int bprice;
	public Book(int bid, String bname, int bprice) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bprice = bprice;
	}
	
	public Book() {
		super();
	}
	
	public int getBid() {
		return bid;
	}
	
	public void setBid(int bid) {
		this.bid = bid;
	}
	
	public String getBname() {
		return bname;
	}
	
	public void setBname(String bname) {
		this.bname = bname;
	}
	
	public int getBprice() {
		return bprice;
	}
	
	public void setBprice(int bprice) {
		this.bprice = bprice;
	}
	
	void discountedPrice(int dis) {
		double less = (5*bprice)/100;
		System.out.println(bprice-less);
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", bprice=" + bprice + "]";
	}
	
	

}
