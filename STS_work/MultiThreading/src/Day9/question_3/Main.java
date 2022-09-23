package Day9.question_3;

public class Main {

	public static void main(String[] args) {

		OddThread o1 = new OddThread();
		Thread t1 = new Thread(o1);
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		EvenThread e1 = new EvenThread();
		Thread t2 = new Thread(e1);
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("End of Main");
	}

}
