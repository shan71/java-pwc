package threads;

public class ThreadDemo2 {

	public static void main(String[] args) throws Exception{
		
		Thread t1=new Thread(new Worker());
		Thread t2 = new Thread(new Worker());
		
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
