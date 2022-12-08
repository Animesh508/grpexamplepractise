package pack4_thread_creation_2;

public class controller {
	public static void main(String[] args) {
		MyJob m = new MyJob();
		m.start();
		System.out.println("i am main");
	}

}

class MyJob extends Thread {
	@Override
	public void run() {
		
		System.out.println("i am thread way 2");
	}
	public void run(int a) {
		
	}
}
