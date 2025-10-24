package mar1.instanceoff.com;

//whenever we perform downcasting directly we get compilation error but downcasting is possible through 
//Instanceof operator(downcating-reference of childclass refers to object of parent class).
//Ex:Downcasting using instanceof operator
class Animals{
	
}
public class Dog1 extends Animals{
	static void method(Animals a) {
		if(a instanceof Animals) {
			Dog1 d = (Dog1)a;//downcasting
			System.out.println("Downcasting performed");
		}
	}

	public static void main(String[] args) {
		Animals a = new Dog1();
		Dog1.method(a);
		
	}

}
