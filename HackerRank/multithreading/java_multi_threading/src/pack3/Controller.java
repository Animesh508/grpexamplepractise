 package pack3;

public class Controller {
	public static void main(String[] args) {
		Thread t= new Thread(new child());
		t.start();
		System.out.println("i am main");
	}
}



class child implements Runnable{
	@Override
	public void run() {
		System.out.println("i am child class ");
		
	}
}