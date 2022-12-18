package demo.sample.examples;

public class Controller {

	public static void main(String[] args) {
		

		ChildThread childThread = new ChildThread();
		childThread.start();
		
		int i = 1000;
		while(i > 0) {
			System.out.println(" Parent >>  " + i);
			i--;
		}
		
	
	
	}
}
