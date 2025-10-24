package com.cg.day5;

public class Customer implements Comparable <Customer> {
	int custId;
	String custName;
	String custAddress;
	
	
	public Customer (int custId, String custName, String custAddress) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAddress = custAddress;
	}
	
	public int getCustId() {
		return custId;
	}
	
	public void setCustId(int custId) {
		
		this.custId = custId;
	}
	
	public String getCustName() {
		return custName;
	}
	
	public void setCustName(String custName) {
		this.custName =  custName;
	}
	
	public String getCustAddress() {
		return custAddress;
	}
	
	public void setCustAge(String custAddress)
	{
		this.custName = custAddress;
	}
	
	  public boolean equals(Object obj) {
		  Customer c=(Customer)obj;
		  if(this.custName.equals(c.getCustName()))
			  return true;
		  return false;
	  }
	  
	  @Override
	  public int compareTo(Customer o) {
		  return this.custName.compareTo(o.getCustName());
	  }

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custAddress=" + custAddress + "]";
	}
	  
	  
}
