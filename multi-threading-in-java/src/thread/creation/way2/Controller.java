package thread.creation.way2;

class MyJob extends Thread{

	@Override
	public void run() {
		System.out.println("I am Child thread way 1");
	}
	
	public void run(int a) {
		
	}
	
}
public class Controller {
	
	public static void main(String[] args) {
		
		MyJob c = new MyJob();
		c.start();
		
		
	}

}




// 12 cases >>  9:30 pm












