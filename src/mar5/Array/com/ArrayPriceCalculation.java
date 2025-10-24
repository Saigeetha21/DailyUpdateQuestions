package mar5.Array.com;

public class ArrayPriceCalculation {
	public static void main(String[] args) {
		
	
	double price[] = {10.23,20.93,21,45};
	double totalPrice = 0;
	for(int i =0;i<price.length;i++) {
		totalPrice = totalPrice+price[i];
		System.out.println("Total price is"+totalPrice);
	}
	
	}
}
