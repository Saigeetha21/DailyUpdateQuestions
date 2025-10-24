package com.cg.day15;

public class CustomerRegistration {
	
	String username;
	String customerCountry;
	
	public void registerCustomer(String username, String customerCountry) throws InvalidCountryException{
		if(!customerCountry.equals("Blore")) throw
		new InvalidCountryException(customerCountry);
			
		else
			System.out.println("user registration done successfully");
		
		
	}

	public static void main(String[] args) {
		CustomerRegistration registration = new CustomerRegistration();
		try {
			registration.registerCustomer("geetha", "Blore");
		}
		catch(InvalidCountryException e) {
			System.out.println("Customer outside blore can not be registered");
		}
		

	}

}
