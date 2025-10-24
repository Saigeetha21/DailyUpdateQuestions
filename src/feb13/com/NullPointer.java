package feb13.com;

public class NullPointer {

	public static void main(String[] args) {
		try {
			String s ="";
		}catch(NullPointerException e) {
			System.out.println(e);
		}

	} 

}
