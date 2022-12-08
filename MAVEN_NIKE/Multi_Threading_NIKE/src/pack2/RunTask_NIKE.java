package pack2;

public class RunTask_NIKE {
	public void doOperation(){
		long l = 0l;
		for(int i = 1001; i<=2000; i++) {
			
			l = l + i;
		}
		System.out.println("i am a child thread =" + l);
	}

}
