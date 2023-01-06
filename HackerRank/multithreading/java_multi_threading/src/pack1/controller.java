package pack1;

public class controller {
	public static void main(String[] args) {
		test1 t = new test1();
		t.start();
		
		int i = 1000;
		while(i>0) {
			System.out.println("parrent >>" + i);
			i--;
		}
	}

}
