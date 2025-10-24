package feb29.staticbinding.com;

class Vehicle{
	void drive() {
		System.out.println("Vehicle is driving");
	}
}

class Car extends Vehicle{
	void drive() {
		System.out.println("Car is driving");
	}
}

public class CarMain {

	public static void main(String[] args) {
		Vehicle v = new Vehicle ();
		v.drive();//static binding - compiler compiles drive to vehicle class at compile time
		Vehicle c = new Car();
		c.drive();//dynamic binding - jvm binds drive to car class at runtime
		// TODO Auto-generated method stub

	}

}
