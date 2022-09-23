package com.question_4;

public class ThreadA implements Runnable{

	@Override
	public void run() {

for(int i=1; i<=10; i++) {
	
	System.out.println("numbers in "+Thread.currentThread().getName()+" "+i);
}
		
	}

}
