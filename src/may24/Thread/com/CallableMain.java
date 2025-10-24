package may24.Thread.com;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class SumTask implements Callable<Integer> {
    private int a, b;

    public SumTask(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer call() throws Exception {
        return a + b;
    }
}
  
public class CallableMain {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(new SumTask(10, 20));

        try {
            Integer result = future.get(); // Blocking call, waits for the result
            System.out.println("Sum is: " + result);
        } catch (InterruptedException | ExecutionException e) {
            System.out.println(e);
        }

        executor.shutdown();
    }
}
