package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorDemo {

	public static void main(String[] args) {

		//ExecutorService pool = Executors.newFixedThreadPool(4);
		//ExecutorService pool = Executors.newCachedThreadPool();
		ScheduledExecutorService sc=Executors.newScheduledThreadPool(5);
		for (int i = 0; i < 5; i++) {
			
			sc.schedule(new Worker(), 2000, TimeUnit.MILLISECONDS);
			//pool.submit(new Worker());
		}

		sc.shutdown();

	}

}
