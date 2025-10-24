package feb29.staticbinding.com;

class Food{
	void eat() {
		System.out.println("Eating food");
	}
}
class Puri extends Food{
	void eat() {
		System.out.println("Puri eating");
	}
	
	void bite() {
		System.out.println("bite the puri");
	}
}
public class FoodMain {

	public static void main(String[] args) {
		
		Food f = new Food();
		f.eat();// static binding
		
		Food b = new Puri();
		b.eat();
	// TODO Auto-generated method stub

	}

}
