package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AddreTaskMain {

	public static void main(String[] args) throws Exception{
		ExecutorService pool=Executors.newCachedThreadPool();
		
		Future<Integer> response= pool.submit(new AddWorker(10, 20));
		
		Integer sum=response.get();
		System.out.println(sum);

	}

}
