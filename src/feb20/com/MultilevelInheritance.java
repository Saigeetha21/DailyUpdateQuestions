package feb20.com;
class Animals{
	void eat() {
		System.out.println("Animals are eating");
	}
}

class Cow extends Animals{
	void shout() {
		System.out.println("cow are shouting");
	}
}
class BabyCow extends Cow{
	void drink() {
		System.out.println("Babycows are drinking milk");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
	       BabyCow b = new BabyCow();
				b.eat();
				b.shout();
				b.drink();
		
		
	}

}
