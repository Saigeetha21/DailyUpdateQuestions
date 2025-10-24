package feb29.staticbinding.com;
class Animal2{
	void makeSound() {
		System.out.println("Generic sound");
	}
}

class Dog2 extends Animal2{
	void makeSound() {
		System.out.println("Bark");
	}
	void makeSound(String sound) {
		System.out.println("Sound");
		
	}
}
public class StaticDynamic {

	public static void main(String[] args) {
		Animal2 a = new Dog2();//Animal reference to Dog Object
		a.makeSound(); //dynamic binding-JVM binds makeSound() to Dog class at runtime
		Animal2 b = new Animal2();//Animal reference to Animal Object
		b.makeSound();//Static binding-compiler binds makeSound to Animal class at compile time
		
	}

}
