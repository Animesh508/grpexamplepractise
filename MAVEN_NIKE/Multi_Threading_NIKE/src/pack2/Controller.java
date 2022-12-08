package pack2;

public class Controller {
	public static void main(String[] args) {
		Worker_Nike w = new Worker_Nike();
		w.start();
		
		long l = 0l;
		for(int i = 1001 ; i<=2000 ; i++) {
			
			l = l + i;
		}
		System.out.println("i am main thread =" + l);
	}

}
