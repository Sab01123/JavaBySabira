package Runnable;


public class Join implements Runnable{
	 int sum;
	@Override
	public void run() {
     
		for(int i=0; i<5; i++) {
			System.out.println("inside run");
			sum = sum+i; 
		}
	}

	public static void main(String[] args) {

		Join j1 = new Join();
		Thread t1 = new Thread(j1);
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int result = j1.sum;
		for(int i=0; i<5; i++) {
			System.out.println("inside main");
		 System.out.println(result);
		}
		
		System.out.println("end of main");
		
	}

	

}
