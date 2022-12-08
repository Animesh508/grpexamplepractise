package pack2;

public class EntryPoint_NIKE {
	public static void main(String[] args) {
		child c = new child();
		c.start();
		for(int i = 0; i<1000; i++) {
			System.out.println(i);
		}
		System.out.println("i am main");
		
	}

}

class child extends Thread {
	@Override
	public void run() {
		System.out.println("i am child");
		super.run();
	}
	
}
