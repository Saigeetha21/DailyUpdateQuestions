package feb29.staticbinding.com;
//If there is any private, final or static method in a class, there is static binding
public class Dog {
	private void eat() {
		System.out.println("Dog is eating");
	}
	public static void main(String[] args) {
		Dog d  = new Dog();
		d.eat();
	}

}
