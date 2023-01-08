package threading;

public class Test {

	public static void main(String[] args) {
		
		Thread t1 = new ThreadImpl1();
		t1.start();
			
		 ThreadImpl2 threadImpl2 = new ThreadImpl2();
		
		Thread t2= new Thread(threadImpl2);
		t2.start();
	}
}
