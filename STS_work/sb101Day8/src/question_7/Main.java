package question_7;

public class Main {

	public static void main(String[] args) {

		
		PriorityThread p = new PriorityThread();
		
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(p);
		
		t1.setName("Dhoni");
		t2.setName("Kohli");
		
		t1.setPriority(8);
		t2.setPriority(10);
		
		t1.start();
		t2.start();
		
		
		for(int i=0; i<10; i++) {
			System.out.println("Main is running " + Thread.currentThread().getPriority());
		}
	}

}
