package demo.sample.examples;

public class EntryPoint {

	public static void main(String[] args) {
		
		Work w =new Work();
		w.start();
		for(int i =0 ; i<1000;i++);
		System.out.println("main");
	}
}

class Work extends Thread{
	
	@Override
	public void run() {
		for(int i =0 ; i<1000;i++);
		System.out.println("Hi hello");
	}
}