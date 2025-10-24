package feb29.staticbinding.com;
//At compile-time, the compiler only knows that a is of type Animal. 
//It doesn't know the actual type of object a is referring to at runtime.
class Animal{
	void eat() {
		System.out.println("Animals are eating");
	}
}
public class Dogs extends Animal {
	void eat() {
		System.out.println("Dog is eating");
	}
	public static void main(String[] args) {
	Animal b= new Dogs();
	b.eat();
	}
}
//In the above example object type cannot be determined by the compiler, 
//because the instance of Dog is also an instance of Animal.So compiler doesn't know its type, only its base type.
