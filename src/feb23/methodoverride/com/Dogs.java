package feb23.methodoverride.com;

class Animals{
	void eat() {
		System.out.println("Animals are eating");
	}
}
public class Dogs extends Animals {
	void eat() {
		System.out.println("dogs are eating");
	}
	
	public static void main(String[] args) {
	
	 Dogs d = new Dogs();
	 d.eat();
	}

}