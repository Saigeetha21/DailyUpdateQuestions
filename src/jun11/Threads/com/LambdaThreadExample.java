package jun11.Threads.com;

public class LambdaThreadExample {

	public static void main(String[] args) {
		Thread thread = new Thread(()->{
			System.out.println("The thread is running");
		});
		thread.start();
		
	}

}
