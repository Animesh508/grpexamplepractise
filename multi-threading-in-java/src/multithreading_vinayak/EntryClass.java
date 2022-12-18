package multithreading_vinayak;

class Task extends Thread{
	
	@Override
	public void run() {
		
		Thread t = Thread.currentThread();
		
		for(int i=0;i<100;i++) {
			
		System.out.println("This is "+t.getName()+" Thread");
		
		}
		
	}
}

public class EntryClass {
	
	public static void main(String[] args) {
		
		Thread t = new Thread(new Task());
		
		Task t1 = new Task();
		
		t1.setName("Child");
		
		t1.start();
		
		for(int i=1;i<1000;i++) {
		
		System.out.println("This is main "+t.getName());
		
		}
	}

}
