package may24.Thread.com;

class Task implements Runnable {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + " running: " + i);
            try {
                Thread.sleep(500); // Sleep for 0.5 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class MultipleThreadsMain {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Task("Thread 1"));
        Thread t2 = new Thread(new Task("Thread 2"));
        Thread t3 = new Thread(new Task("Thread 3"));

        t1.start();
        t2.start();
        t3.start();
    }  
}
