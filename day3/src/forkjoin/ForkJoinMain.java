package forkjoin;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class ForkJoinMain {

	public static void main(String[] args) {
		ForkJoinPool fjpool=ForkJoinPool.commonPool();
		
		List<Integer> numList=Arrays.asList(1,2,3,4,5,6,7,8,9,1,23,45,67,89,12);
		RecursiveAdderTask task=new RecursiveAdderTask(numList);
		int sum=fjpool.invoke(task);
		System.out.println(sum);
		fjpool.shutdown();

	}

}
