package com.cg.day5;

import java.util.Comparator;

public class MyComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer c1, Customer c2) {
		// TODO Auto-generated method stub
		if(c1.getCustId()==c2.getCustId())
		return 0;
		else if (c1.getCustId()> c2.getCustId())
			return 1;
		else
			return -1;
	}

}
