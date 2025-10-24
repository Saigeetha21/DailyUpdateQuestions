package com.cg.day12;

public class Source {
	public static void main(String[] args) {
		String seller ="geetha";
		String buyer ="teja";
		TransactionParty tp = new TransactionParty(seller,buyer);
		String productQR = "250,10@100,3@50,7";
		Receipt receipt = new Receipt(tp,productQR);
		GenerateReceipt.verifyParty(receipt);
		GenerateReceipt.calcGST(receipt);
	}
	
	

}
