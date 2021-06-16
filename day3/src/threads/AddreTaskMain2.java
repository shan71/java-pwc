package threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import javax.naming.spi.DirStateFactory.Result;

public class AddreTaskMain2 {

	public static void main(String[] args) throws Exception{
		//ExecutorService pool=Executors.newCachedThreadPool();
		ThreadPoolExecutor pool=(ThreadPoolExecutor)Executors.newCachedThreadPool();
		
		List<AddWorker> taskList=new ArrayList<>();
		for(int i=0;i<10;i++) {
			taskList.add(new AddWorker(i, i+1));
		}
		
		List<Future<Integer>> responses=pool.invokeAll(taskList);
		do {
			for(Future result:responses) {
				System.out.println("Is the task completed : "+result.isDone());
			}
			
		}while(pool.getCompletedTaskCount()<responses.size());
		
		//responses.stream().map(f->f.get()).forEach(System.out::println);
		for(Future<Integer> f:responses) {
			
			System.out.println(f.get());
		}
		
		
		System.out.println("No of Tasks : "+taskList.size());
		
		pool.shutdown();

	}

}
