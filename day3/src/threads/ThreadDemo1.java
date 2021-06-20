package threads;

public class ThreadDemo1 {

	public static void main(String[] args) throws Exception{
		
		MyThread t1= new MyThread();
		MyThread t2=new MyThread();
		
		System.out.println("Main Thread "+Thread.currentThread());
		System.out.println("t1 "+t1);
		System.out.println("t2 "+t2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println(Thread.currentThread().getName()+" exited..");

	}

}
