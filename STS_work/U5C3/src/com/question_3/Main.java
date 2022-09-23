package com.question_3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws Exception {

		
		MyCallable [] n = {
				
				new MyCallable(1),
				new MyCallable(2),
				new MyCallable(3),
				new MyCallable(4),
				new MyCallable(5),
				new MyCallable(6),
		};
		
	ExecutorService s = Executors.newFixedThreadPool(3);
		
	for(MyCallable i:n) {
		Future<Integer> f = s.submit(i);
		System.out.println(f.get());
	}
	s.shutdown();
	
	}

}
