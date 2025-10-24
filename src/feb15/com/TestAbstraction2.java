package feb15.com;

abstract class Bike1{
	Bike1(){System.out.println("Bike is created");}
	abstract void run();
	void changeGear() {System.out.println("Gear is changed");}
}
class Honda1 extends Bike1{
	void run() {
		System.out.println("Running safely");
	}
}
public class TestAbstraction2 {

	public static void main(String[] args) {
		Bike1 b = new Honda1();
		b.run();
		b.changeGear();
		
		

	}

}
