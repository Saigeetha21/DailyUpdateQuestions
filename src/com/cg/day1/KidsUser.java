package com.cg.day1;

public class KidsUser implements LibraryUser{
	int age;
	String bname;
	

	
	public KidsUser() {
		super();
	}


	public void registerAccount(int age) {
		this.age=age;
		if(age<12) {
			System.out.println("you have successfully registerd under a kid user");
		}else
			System.out.println("sorry, age must be less than 12 to register");
		
		
	}       

	
	public void requestBook(String bname) {
		if(bname.equals("kids")) {
			this.bname=bname;
			System.out.println("Book issued successfully, please return the book within the 10 days");
			
		}else
			System.out.println("oops, you are allowed to take only kids book");
		
	}

}
