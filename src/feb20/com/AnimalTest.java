package feb20.com;

class Animal{
	void bark() {
		System.out.println("Animal is barking");
		
	}
}
class Dog extends Animal{
	void eat() {
		System.out.println("Dog is eating");
	}
}
public class AnimalTest {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.bark();
		
	}
}
