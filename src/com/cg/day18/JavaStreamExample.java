package com.cg.day18;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.cg.day18.Product;


/*public class Product {
	int id;
	String name;
	float price;
	public Product(int id,String name,float price) {
		this.id =id;
		this.name=name;
		this.price=price;
	}

}*/


public class JavaStreamExample{
	public static void main(String[] args) {
		List<Product> productList= new ArrayList<Product>();
		productList.add(new Product(1,"HP laptop",25000f));
		productList.add(new Product(2,"Dell Laptop",30000));
		productList.add(new Product(3,"Lenevo Laptop",28000f));
		productList.add(new Product(4,"Sony Laptop",90000f));
		productList.add(new Product(5,"Apple Laptop",50000f));
		List<Float> pricesList = productList.stream()
				.filter(p ->p.price>30000)
				.map(pm ->pm.price)
				.collect(Collectors.toList());
		System.out.println(pricesList);
				
				
		
	}
}