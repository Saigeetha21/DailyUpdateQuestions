package feb14.com;

interface canara {
	int simpleinterest();
}

interface kotak{
	int compoundinterest();
}
public class Bank implements canara,kotak{
	
	public int simpleinterest() {
		return 9;
	}
	public int compoundinterest() {
		return 10;
	}

	public static void main(String[] args) {
		Bank b1 = new Bank();
		System.out.println(b1.simpleinterest());
		System.out.println(b1.compoundinterest());
			
		

	}

}
