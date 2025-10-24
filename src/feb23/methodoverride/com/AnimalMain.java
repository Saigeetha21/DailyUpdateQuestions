package feb23.methodoverride.com;

//Superclass
class Animal {
 void makeSound() {
     System.out.println("Some generic sound");
 }
}

//Subclass overriding the makeSound() method
class Dog extends Animal {
 @Override
 void makeSound() {
     System.out.println("Woof");
 }
}

//Another subclass overriding the makeSound() method
class Cat extends Animal {
 @Override
 void makeSound() {
     System.out.println("Meow");
 }
}


public class AnimalMain {
 public static void main(String[] args) {
     Animal animal1 = new Dog();
     Animal animal2 = new Cat();
     
     animal1.makeSound(); // Output will be "Woof"
     animal2.makeSound(); // Output will be "Meow"
 }
}
