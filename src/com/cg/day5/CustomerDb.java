package com.cg.day5;

import java.util.ArrayList;
import java.util.Collections;

public class CustomerDb {
	MyComparator com = new MyComparator();
	  ArrayList<Customer> custList = new ArrayList<Customer>();
public boolean addCustomer(Customer c) {
	custList.add(c);
	return true;
}
public ArrayList<Customer> getAllCustomer() {
	return custList;
}
 public Customer getCustomer(int cid) {
	for(int i = 0; i<custList.size(); i++) {
		Customer c = custList.get(i);
		if(cid == c.getCustId())
			return c;
	}
	return null;
}

   public boolean updateCustomer(Customer c) {
	   for(int i=0; i<custList.size();i++) {
		   Customer c1 = custList.get(i);
		   if(c1.getCustId()== c.getCustId()) {
			   custList.set(i,  c);
			   
		   }
	   }
	   return true;
   }
   
   public boolean removeCustomer(int cid) {
	   Customer c;
	   c = getCustomer(cid);
	   custList.remove(c);
	   return true;
   }
   
   public ArrayList<String> getCustomerByAddress(String cAddress){
	   ArrayList<String> custNames = new ArrayList<String>();
	   for(Customer c : custList) {
		   if(c.getCustAddress().equals(cAddress)) {
			   custNames.add(c.getCustName());
		   }
	   }
	   return custNames;
   }
   
   public void SortByIds() {
	   Collections.sort(custList, com);
	   System.out.println(custList);
   }
   public void SortByNames() {
	   Collections.sort(custList);
	   System.out.println(custList);
   }

}
