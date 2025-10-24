package com.cg.day9;

public class PizzaTest {

	public static void main(String[] args) {
		
		
		Pizza p1 = new Pizza("Medium",10);
		Pizza p2 = new Pizza("Regular",10);
		Pizza p3 = new Pizza("Large",10);
		Pizza [] p = {p1, p2, p3};
		
		
		Foodie f = new Foodie(101, "surya","Chennai",1233349023);
		
		for(int i = 0; i<p.length;i++) {
			System.out.println(p[i]);
		}
		
		int totalPrice = f.calculatePrice(p);
		
		System.out.println(totalPrice);
		
		SuperFoodie sf = new SuperFoodie(102,"smith","kolkata",1789239043,3);
		int totalPricesf = sf.calculatePrice(p);
		System.out.println(totalPricesf);
		
		UltraFoodie uf = new UltraFoodie(103,"vicky","hyderabad",1683969400,100);
		int totalPriceuf = uf.calculatePrice(p);
		System.out.println(totalPriceuf);
		
	}	

}
