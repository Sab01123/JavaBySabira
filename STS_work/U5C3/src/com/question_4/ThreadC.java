package com.question_4;

public class ThreadC implements Runnable{
int pro =1;
	@Override
	public void run() {
for(int i=1; i<=10; i++) {
	pro= pro*i;
	
	System.out.println(Thread.currentThread().getName()+" Product is: "+pro);
			}
	}

}
