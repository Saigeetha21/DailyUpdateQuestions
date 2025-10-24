package feb13.com;


public class CustomExceptionEX {

	public static void main(String[] args) {
		try {
			int year = 1999;
			if(year<2000) {
				throw new CustomException("The year should be greater than 2000");
			}
			System.out.println("Access Granted");
		}catch(CustomException e) {
			System.out.println("Error"+e.getMessage());
		}
		
	} 

}
