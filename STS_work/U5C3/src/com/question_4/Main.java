package com.question_4;

public class Main {

	public static void main(String[] args) {

        ThreadA a1 = new ThreadA();
        Thread t1 = new Thread(a1);
        t1.setName("Kohli");
        t1.setPriority(6);
        t1.start();
        
        ThreadB b1 = new ThreadB();
        Thread t2 = new Thread(b1);
        t2.setName("Dhoni");
        t2.setPriority(10);
        t2.start();
        
        ThreadC c1 = new ThreadC();
        Thread t3 = new Thread(c1);
        t3.setName("Rohit");
        t3.setPriority(7);
		t3.start();
		
	}

}
