package feb9.com;

public class LambdaThreadCreation {

	public static void main(String[] args) {
     //Create a thread using a lambda expression
		Thread thread = new Thread(() -> {
			//code to be executed in the new thread
			for (int i=1; i<=5; i++) {
				System.out.println("Thread:" +Thread.currentThread().getId() + " -count"+i);
			}
		});
		//Start the thread
		thread.start();
	

	}

}
