package feb28.runtimepoly.com;

class Animal1{  
void eat(){
	System.out.println("animal is eating...");
	}  
}  
class Dog1 extends Animal1{  
void eat(){
	System.out.println("dog is eating...");
	}  
}  
class BabyDog extends Dog1{  
public static void main(String args[]){  
Animal1 a=new BabyDog();  
a.eat();  
}
}  