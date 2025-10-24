package feb13.com;

class CustomException extends Exception{
	public CustomException(String message) {
		super(message);
	}
}
  
public class CustomExceptionExample {

	public static void main(String[] args) {
		try {
			int age = 21;
			if(age<22) {
				throw new CustomException("you must be atleast 22 years");
			}
			System.out.println("Access Granted");
		}catch(CustomException e) {
			System.out.println("Error" +e.getMessage());
		}
		

	}

}
