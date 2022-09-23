package Runnable;

public class ThreadName {

	public static void main(String[] args) {

		ThreadA a1 = new ThreadA();
		ThreadB b1 = new ThreadB();
		
		Thread t1 = new Thread(a1);
		Thread t2 = new Thread(b1);
		
		t1.setName("sabira");
		t2.setName("noor");
		
		t1.start();
		t2.start();
		
		System.out.println("end of main");
	}

}
