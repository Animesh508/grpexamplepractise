package demo.sample.examples;

public class RunTask {

	public void doOperation() {
		Long l =0L;
		for(int  i = 1001 ; i <= 2000 ; i++) {
			l = l + i;
		}
		System.out.println("I am child thread = "+l);
	}
}
