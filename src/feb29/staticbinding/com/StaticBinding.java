package feb29.staticbinding.com;
class Animal1{
	void makeSound() {
		System.out.println("Generic Sound");
	}
}
class Dog1 extends Animal1{
	void makeSound() {
		System.out.println("Bark");
	}
}
public class StaticBinding {
	public static void main(String[] args) {
		Animal1 a = new Dog1();
		a.makeSound();
	}

}
