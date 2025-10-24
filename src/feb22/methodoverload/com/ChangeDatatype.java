package feb22.methodoverload.com;
class Add{
	static int add(int a ,int b) {
		return a+b;
	}
	static double add(double a,double b) {
		return a+b;
		
	}
}
public class ChangeDatatype {

	public static void main(String[] args) {
		
		System.out.println(Adder.add(12,90));
		System.out.println(Adder.add(31, 10));
	}

}
