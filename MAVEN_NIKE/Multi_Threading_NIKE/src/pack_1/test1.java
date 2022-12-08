package pack_1;

public class test1 extends Thread {
	
	@Override
	public void run() {
		int i = 1000;
		while (i > 0) {
			System.out.println("child i =" + i);
			i--;
		}
	}

}
