package com.cg.day9;

public class GeneralBankTest {

	public static void main(String[] args) {
		IciciBank i = new IciciBank();
		KotakBank k = new KotakBank();
		
		System.out.println("IciciBank object reference instantiated with icicibank class");
		System.out.println(i.getSavingInterestRate());
		System.out.println(i.getFixedInterestRate());
		
		
		System.out.println("kotakbank object reference instantiated with kotakbank class");
		System.out.println(k.getSavingInterestRate());
		System.out.println(k.getFixedInterestRate());
		
		GeneralBank gb1 = new IciciBank();
		GeneralBank gb2 = new KotakBank();
		
		System.out.println("GeneralBank object reference instantiated with kotakbank class");
		System.out.println(gb1.getSavingInterestRate());
		System.out.println(gb1.getFixedInterestRate());
		
		System.out.println("GeneralBank object reference instantiated with icicibank class");
		System.out.println(gb2.getSavingInterestRate());
		System.out.println(gb2.getFixedInterestRate());
		

	}

}
