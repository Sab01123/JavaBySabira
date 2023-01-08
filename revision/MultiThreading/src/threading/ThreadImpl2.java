package threading;

public class ThreadImpl2 implements Runnable{

	@Override
	public void run() {
		int sum = 0;

		for(int i=1; i<=10000; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
