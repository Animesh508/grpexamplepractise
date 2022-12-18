package demo.sample.examples;

class Task2 extends Thread{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " : "+Thread.currentThread().getPriority());

	}
}


class Task1 extends Thread{
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName() + " : "+Thread.currentThread().getPriority());
		Task2 t1= new Task2();
		t1.start();
	}
}



public class Test {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName() + " : "+Thread.currentThread().getPriority());

		Task1 t = new Task1();
		t.setPriority(8);
		t.start();
		
		
	}
}
