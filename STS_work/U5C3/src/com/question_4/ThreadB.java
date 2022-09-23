package com.question_4;

public class ThreadB implements Runnable{
int sum =0;
	@Override
	public void run() {
for(int i=1; i<=20; i++) {
	sum = sum+i;
	 
}
System.out.println("sum in "+Thread.currentThread().getName()+" " +sum);
	}

}
