package day10.question_6;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {


		Callable[] n = {
				new Callable(1),
				new Callable(2),
				new Callable(3),
				new Callable(9),
				new Callable(4),
				new Callable(6),
		};
		
		
		ExecutorService s = Executors.newFixedThreadPool(3);
		
		for(Callable i:n) {
			Future<Integer> f = s.submit(i);
			System.out.println(f.get());
		}
		
		s.shutdown();
	}

}
