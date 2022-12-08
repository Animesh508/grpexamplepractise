package pack2;

public class Worker_Nike extends Thread{
	@Override
	public void run() {
		RunTask_NIKE r = new RunTask_NIKE();
		r.doOperation();
	}

}
