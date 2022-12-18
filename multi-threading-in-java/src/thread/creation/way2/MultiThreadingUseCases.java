package thread.creation.way2;

class Task extends Thread{

	 @Override
	public void run() {
		 for(int i =0 ; i<=100 ;i ++) {
			 System.out.println("Current Thread Name "+Thread.currentThread().getName());
		 }
	}
	 
	 @Override
	public synchronized void start() {
		 System.out.println("I am start method");
	}
	
}


public class MultiThreadingUseCases {
   
	public static void main(String[] args) {
		
		Task t = new Task();
		t.start();
		
		Task t1 =new Task();
		t1.start();
		
		Task t2 =new Task();
		t2.start();
		
		for(int i =0 ; i<=100 ;i ++) {
			 System.out.println("Current Thread Name "+Thread.currentThread().getName());
		 }
		
	}
}


// case 1] Thread scheduler
// JVM (thread scheduler) P.A

// Thread t= new thread();
// t.strat();
// 1] register >  >> Thread scheduler 
// 2] init
// 3] wait until cpu/core1 access

//--------------------------------------------
// case 2
//  difference  Task t = new Task();
//    t.run()  && t.start();
//  t.run() >> here no new child Thread creation, main thread is calling & executing run method
//  t.start() >> it will create new child thread & that thread is run run() method


//case 3] Role of  Thread class start() method
// 1] Registration of thread 
// 2] init
// 3] once's got cpu/core access then run run method of thread class or its child 

// case 4] If we are not overriding run method of Thread class ??
//          Task t = new Task(); t.start();
//         1] it will create child thread & that child thread call run method of Thread class , which have empty body so no repsonse / no output

// case 5] can we overload run method.
//>> we can overload , but thread is calling rum() method who having zero arg

// case 5] can we overriding start method.











