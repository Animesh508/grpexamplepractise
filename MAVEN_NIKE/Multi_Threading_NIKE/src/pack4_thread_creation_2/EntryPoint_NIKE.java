package pack4_thread_creation_2;

 class Worker extends Thread{
	 @Override
	public void run() {
		Thread c = Thread.currentThread();
		System.out.println("I created thread " + c.getName());
	}
 }

public class EntryPoint_NIKE {
	public static void main(String[] args) {
		Thread c = Thread.currentThread();
		
		Worker w = new Worker();
		w.setName("child");
		w.start();
		System.out.println("i am main method "+ c.getName());
	}

}
