package pack4_thread_creation_2;

class Task extends Thread{
	@Override
	public void run() {
		for(int i = 0; i<=100; i++) {
			System.out.println("current thread name "+ i);
		}
	}
	@Override
	public synchronized void start() {
		
		System.out.println("i am start method");
	}
	
	
}

public class MultiUseCases_NIKE {
	public static void main(String[] args) {
		
		Task t = new Task();
		t.start();
		
		Task t1 = new Task();
		t1.start();
		
		Task t2 = new Task();
		t2.start();
		
		for(int i = 0; i<=100; i++) {
			System.out.println("current thread name "+ Thread.currentThread().getName());
		}
	}

}
