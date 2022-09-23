package com.question_3;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
int pro;
	int num;
	public MyCallable(int num) {
		this.num = num;
	}
	@Override
	public Integer call() throws Exception {
		 pro = 1;
		for(int i=1; i<=num; i++) {
			pro = pro*i;
		}
		return pro;
	}
	
}
