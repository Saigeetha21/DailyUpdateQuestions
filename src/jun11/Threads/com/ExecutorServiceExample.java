package jun11.Threads.com;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		
		Runnable task1 = () ->{
			System.out.println("Task1 is running");
		};
		
		Runnable task2 = () ->{
			System.out.println("Task2 is running");
		};
		executor.submit(task1);
		executor.submit(task2);
		executor.shutdown();

	}

}
