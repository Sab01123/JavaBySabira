package com.question_2;

public class ProductNum extends Thread{
	
	int pro=1;
	@Override
	public void run() {
		
		synchronized (this) {
			for(int i=1; i<10; i++) {
				pro = pro*i;
			}
			this.notify();
		}
	}

}
