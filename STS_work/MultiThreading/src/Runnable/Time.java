package Runnable;

public class Time implements Runnable{
	
	@Override
	public void run() {

		for(int i =0; i<5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		
	}

	public static void main(String[] args) {

		Time t = new Time();
		
		Thread t1 = new Thread(t);
		t1.start();
		
		System.out.println("end of main");
		
	}

	

}
