package jun11.Threads.com;

public class MyRunnable implements Runnable {
	public void run() {
		System.out.println("The thread is running");
	}

	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		Thread thread = new Thread(myRunnable);
		thread.start();
		
	}
	

}
