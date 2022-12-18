package thread.creation.way1;

class ChildJob implements Runnable{

	@Override
	public void run() {
		System.out.println("I am Child thread way 1");
	}
	
}

public class Controller {

	public static void main(String[] args) {
				
		Thread t = new Thread(new ChildJob());
		 t.start();
		 System.out.println("I am main thread");
	}
}
