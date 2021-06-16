package threads;

import java.util.concurrent.Callable;

public class AddWorker implements Callable<Integer> {

	private int a;
	private int b;

	public AddWorker(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public Integer call() throws Exception {
		int result = 0;
		try {

			result = a + b;
			Thread.sleep(10000);
			System.out.println(Thread.currentThread().getName() + " adding " + a + " and " + b);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
		return result;
	}

}
