package multithreading_vinayak;

 class A extends Thread{
	 
	@Override
	public void run() {
		
		Thread t = new Thread();
		
		System.out.println("This is child "+t.getName());
		
	}
	
}

public class MainClass {
	
	public static void main(String[] args) {
		
		A a = new A();
		
		a.start();
		
		System.out.println("This is main "+a.getName());
	}

}
