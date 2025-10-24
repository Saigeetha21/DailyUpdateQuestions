package com.cg.day13;

public class CustomerRegistration {
	String username;
	String customerCountry;
	
	public void registerCustomer(String username, String customerCountry) throws InvalidCountryException{
		
		if(!customerCountry.equals("Blore"))
			throw new InvalidCountryException();
		else
			System.out.println("User registration done successfully");
	}
	
	public static void main(String[] args) {
		CustomerRegistration registration = new CustomerRegistration();
		
		try {
			registration.registerCustomer("geetha","chennai");
			
		}
		catch(InvalidCountryException e) {
			System.out.println("Customer Outside blore cannot be registered");
		}
	}

}
