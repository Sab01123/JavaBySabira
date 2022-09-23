package com.practice1;

public class B extends Thread{

	@Override
	public void run() {
		System.out.println("inside run");
	}
	public static void main(String[] args) {

		B b1 = new B();
		b1.run();//it will be called as a normal method.
		b1.start();//here second thread will start
	}

}
