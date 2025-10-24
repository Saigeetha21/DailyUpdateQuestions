package feb20.com;

class Fruit {
	void sweet() {
		System.out.println("Fruits are sweet");
	}
}
class Apple extends Fruit{
	void colour() {
		System.out.println("Apple is in the red colour");
	}
}

class Banana extends Fruit{
	void taste() {
		System.out.println("Banana taste is sweet");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banana b = new Banana();
		b.taste();
		b.sweet();
		

	}

}
