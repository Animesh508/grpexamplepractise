package pack2;

public class Worker_jai extends Thread {
	@Override
	public void run() {
		RunTask r = new RunTask();
		r.doOperation();
		
	}
	

}
