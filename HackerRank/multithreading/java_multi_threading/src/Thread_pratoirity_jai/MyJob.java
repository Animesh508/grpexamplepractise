package Thread_pratoirity_jai;

import java.util.Iterator;

class Test extends Thread {
	
	
	public void m1() {
		for(int i =1; i<=20; i++) {
			System.out.println(Thread.currentThread().getName());
				
			
		}
	}

}
