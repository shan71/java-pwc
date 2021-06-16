package forkjoin;

import java.util.List;
import java.util.concurrent.RecursiveTask;

public class RecursiveAdderTask extends RecursiveTask<Integer> {

	List<Integer> numList;

	public RecursiveAdderTask(List<Integer> numList) {
		this.numList = numList;
	}

	@Override
	protected Integer compute() {
		System.out.println(Thread.currentThread().getName()+" is processing data");
		int sum = 0;
		if (numList.size() > 2) {
				RecursiveAdderTask t1= new RecursiveAdderTask(numList.subList(0, numList.size()/2));
				RecursiveAdderTask t2= new RecursiveAdderTask(numList.subList(numList.size()/2,numList.size()));
				
				t1.fork();
				t2.fork();
				sum=t1.join()+t2.join();
		}else {
			for(Integer x:numList) {
				sum=sum+x;
			}
		}
		return sum;
	}

}
