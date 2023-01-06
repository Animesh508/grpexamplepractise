package pack4_thread_creation2;

public class controller {
	public static void main(String[] args) {
		job j = new job();
		j.start();
	}
}

class job extends Thread{
	@Override
	public void run() {
		System.out.println("i am thread way 2");
	}
	public void run(int a) {
		
		System.out.println("i am overlodaded");
		
	}
}


