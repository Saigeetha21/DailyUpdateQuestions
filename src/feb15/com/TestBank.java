package feb15.com;

abstract class Bank{
	abstract int getRateOfInt();
}

class PNB extends Bank{
	int getRateOfInt() {
		return 8;
	}
}
class Kotak extends Bank{
	int getRateOfInt() {
		return 9;
	}
}
public class TestBank {

	public static void main(String[] args) {
		Bank b1 = new PNB();
		System.out.println("The rate of interest is:"+b1.getRateOfInt() +"%");
		Bank b2 = new Kotak();
		System.out.println("The rate of interest is:"+b2.getRateOfInt() + "%");
		

	}

}
