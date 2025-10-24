package feb13.com;

public class ArrayOutOfBound {

	public static void main(String[] args) {
		try {
		int a[] = new int[5];
		a[10]=50;
		
		}catch(ArrayIndexOutOfBoundsException a) {
			System.out.println(a);
		}

	}
  
}
