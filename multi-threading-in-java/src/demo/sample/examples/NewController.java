package demo.sample.examples;

public class NewController {

	public static void main(String[] args) {
		MyWorker myWorker = new MyWorker();
		myWorker.start();
		Long l =0L;
		for(int  i = 1001 ; i <= 2000 ; i++) {
			l = l + i;
		}
		System.out.println("I am Main thread = "+l);
	}
}
