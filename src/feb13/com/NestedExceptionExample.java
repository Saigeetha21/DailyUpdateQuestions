package feb13.com;

public class NestedExceptionExample {

	public static void main(String[] args) {
	 try {
		 int[] numbers = {1,3,2};
		 int result = numbers[0]/numbers[3];
		 System.out.println(result);
	 }catch(ArrayIndexOutOfBoundsException e) {
		 System.out.println("Error: Array index out of bounds");
	 }catch(ArithmeticException e) {
		 System.out.println("Error:Division by zero");
		 
	 }catch(Exception e) {
		 System.out.println("Error:An unexcepted error Occured");
	 }

	} 

}
