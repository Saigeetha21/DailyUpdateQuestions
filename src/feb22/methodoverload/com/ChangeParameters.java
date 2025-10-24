package feb22.methodoverload.com;

class Adder{
	static int add(int a,int b) {
		return(a+b);
	}
	static int add(int a ,int b,int c) {
		return(a+b+c);
	}
}
public class ChangeParameters {

	public static void main(String[] args) {
		System.out.println(Adder.add(12, 21));
		System.out.println(Adder.add(12, 02,17));
		

	}

}
