package feb13.com;

public class MultipleExceptionExample {

	public static void main(String[] args) {
		try {
		int a =100/0;
		String s ="geetha";
		int result = Integer.parseInt(s);
		}catch(NumberFormatException | ArithmeticException e) {
			System.out.println("Error:NumberFormat exception or Arithmetic Exception");
			
		}finally {
			System.out.println("The program having both the errors");
		} 
	}

}
