package thread.priority.example;

class MyJob extends Thread{
	@Override
	public void run() {
		for(int i = 1;  i<=20; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}


public class Test {

	public static void main(String[] args) {
		
		Thread.currentThread().setPriority(3);
		
		MyJob j1 = new MyJob();
		j1.setName("R");
		j1.setPriority(1);
		
		
		MyJob j2 = new MyJob();
		j1.setPriority(7);
		j2.setName("G");
				
		MyJob j3 = new MyJob();
		j3.setName("B");
		j3.setPriority(10);
		
		j3.start();j1.start(); j2.start();
		
		
		for(int i = 1;  i<=20; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
