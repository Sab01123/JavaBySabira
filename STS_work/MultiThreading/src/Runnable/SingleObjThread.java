package Runnable;

class RunThread implements Runnable{

	@Override
	public void run() {

for(int i=0; i<10; i++) {
	String s1 = Thread.currentThread().getName();
	System.out.println(s1+" is running "+ Thread.currentThread().getPriority());
	
}
		
	}
	
}


public class SingleObjThread {

	public static void main(String[] args) {

		RunThread r1 =new RunThread();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		
		t1.setName("sabira");
		t2.setName("noor");
		
		t1.setPriority(2);
		t2.setPriority(1);
		t1.start();
		t2.start();
		
//		System.out.println("t1 thread priority : " + t1.getPriority());
//		System.out.println("t2 thread priority : " + t2.getPriority());

		
		for(int i=0; i<10; i++) {
			System.out.println("main");
		}
	}

}
