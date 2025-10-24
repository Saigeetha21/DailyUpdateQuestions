package com.cg.day1;

public class AdultUser implements LibraryUser{
	int age;
	String bname;
	public AdultUser() {
		super();
	}

	public void registerAccount(int age) {
		this.age=age;
		if(age>12) {
			System.out.println("you have successfully registered under an adult user");
		}else 
			System.out.println("sorry, age must be greater than 12 to register in adult section");
		
		
		
	}                
	
	public void requestBook(String bname) {
		this.bname=bname;
		if(bname.equals("fiction")) {
			System.out.println("Book issued successfully ,please return the book within 10 days");
			
		}else
			System.out.println("oops, you are allowed take only adult user books");
		
		
	}
}