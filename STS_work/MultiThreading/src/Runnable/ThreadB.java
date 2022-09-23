package Runnable;

public class ThreadB implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			String s = Thread.currentThread().getName();
			System.out.println(s+ "is running");
		}		
	}

}
