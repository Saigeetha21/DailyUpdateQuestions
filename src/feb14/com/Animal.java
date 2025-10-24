package feb14.com;

interface dog{
	void eating();
	//dog method is created 
}

interface cow{
	void feeding();
}
public class Animal implements dog,cow{
	
	public void eating() {
		System.out.println("dog is eating");
	}
	public void feeding() {
		System.out.println("cow is feeding to their babies");
	}

	public static void main(String[] args) {
		Animal a = new Animal();
		a.feeding();
		a.eating();
		
	}

	

}
