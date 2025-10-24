package feb27.finalkeyword.com;

//We can use final keyword with class,variable,method
//1.class-It can be extended ,2.Method-It can be Inherited ,3.Variable-we cannot change the value.
class Bike{
	final void run() {
		System.out.println("Bike is riding");
	}
	
}
public class Honda extends Bike {

	public static void main(String[] args) {
		Honda h = new Honda();
		h.run();
		

	}

}
