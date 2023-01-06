package pack2;

public class controller {
	
	public static void main(String[] args) {
		Worker_jai work = new Worker_jai();
		work.start();
		
		long n = 0L;
		
		for(int i = 1001; i<=2000; i++) {
			n = n+i;
			
		}
		System.out.println("main class "+ n );
		
		
	}

}
