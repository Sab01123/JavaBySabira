package Runnable;

public class A implements Runnable{
	@Override
	public void run() {

for(int i = 10; i<20; i++ ) {
	System.out.println(i);
}
System.out.println("end of run");
	}

	public static void main(String[] args) {
		
		A a1 = new A();
		
		Thread t1 = new Thread(a1);
	t1.start();
  //t1.start();// java.lang.IllegalThreadStateException
		
		for(int i = 0; i<10; i++ ) {
			System.out.println(i);
		}
		System.out.println("end of main");
		
		
		
	}

}
