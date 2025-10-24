package feb13.com;

public class FinallyBlockExample {

	public static void main(String[] args) {
		try {
			int[] numbers = {1,2,3};
			int result = numbers[0]/numbers[2];
		}catch(ArrayIndexOutOfBoundsException a) {
			
			System.out.println("Result:Array out of bound exception");
		}catch(ArithmeticException a) {
			System.out.println("Error:division by zero");
		}finally {
			System.out.println("Finally program is executed");
		} 

	}

}
