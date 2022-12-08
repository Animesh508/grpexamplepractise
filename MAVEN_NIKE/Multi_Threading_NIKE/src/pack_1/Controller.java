package pack_1;

public class Controller {
	public static void main(String[] args) {
		test1 t = new test1();
		t.start();
		
		int i = 1000;
		while(i >0) {
			System.out.println("parent i =" + i);
			i--;
		}
	
		
	}

}
