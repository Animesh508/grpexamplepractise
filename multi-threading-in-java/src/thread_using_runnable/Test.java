package thread_using_runnable;


class MyJob implements Runnable{
	
		public void run() {
			System.out.println(Thread.currentThread().getName());
		}
}



public class Test {

	public static void main(String[] args) {
		
		Thread t = new Thread(new MyJob(),"Chotta");
		t.start();
		
		System.out.println(Thread.currentThread().getName());
	}
}
