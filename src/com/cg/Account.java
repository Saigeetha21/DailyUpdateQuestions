package com.cg;

public class Account {
	private int aco;
	private String acname;
	private double bal;
	public Account(int aco, String acname, double bal) {
		super();
		this.aco = aco;
		this.acname = acname;
		this.bal = bal;
	}
	
	public int getAco() {
		return aco;
	}
	
	public void setAco(int aco) {
		this.aco = aco;
	}
	public String getAcname() {
		return acname;
	}
	public void setAcname(String acname) {
		this.acname = acname;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	public String toString() {
		return aco+ " " +acname+ " " +bal;
	}
	
	public void printBal() {
		System.out.println(bal);
	}

	public void withDraw(int amt) {
		bal = bal-amt;
	}
	public void deposit(int amt) {
		bal = bal+amt;
	}
}
