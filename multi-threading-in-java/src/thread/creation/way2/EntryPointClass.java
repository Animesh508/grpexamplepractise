package thread.creation.way2;

class Worker extends Thread{
	
	@Override
	public void run() {
		
		Thread c = Thread.currentThread();
		System.out.println("I created Thread "+c.getName());
	}
}

public class EntryPointClass {


	public static void main(String[] args) {

		Thread c = Thread.currentThread();

		Worker w = new Worker();
		w.setName("child");
		w.start();
				
		System.out.println("I am main method "+c.getName());
	}
}

// class loader first load .class file from HDD
// jvm start
// jvm main thread
// main therad is responsible to run code
