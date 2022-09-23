package Thread;

public class AwithThread extends Thread{

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
		System.out.println("End of run");
	}
	public static void main(String[] args) {

		AwithThread a1 = new AwithThread();
		a1.start();
		
		for(int j=20; j<30; j++) {
			System.out.println(j);
		}
		
		System.out.println("End of main");
		/*Here functionality of the start() method is to pick the run() method present in the object on which the start() method is
		called and to handover this run() method to the thread-scheduler for the Scheduling.
		Control will be in the main() method and other statements of main() will be executed simultaneously along with run()
		method.
		Since both the threads are getting executed simultaneously, the start/end execution of a thread completely depends
		on the time slice allocated for each method thread*/

		//Because of scheduling we can't guess the output of the above application.

	}

}
