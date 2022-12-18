package demo.sample.examples;

public class MyWorker  extends Thread{

	@Override
	public void run() {
		RunTask r = new RunTask();
		r.doOperation();
	}
}
