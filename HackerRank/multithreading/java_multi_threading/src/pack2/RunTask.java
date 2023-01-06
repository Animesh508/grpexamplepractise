package pack2;

public class RunTask {
	public void doOperation() {
		long l = 0L;
		for(int i = 1001; i<=2000; i++) {
			l = l+i;
		}
		System.out.println(" i am child " +  l);

	}

}
