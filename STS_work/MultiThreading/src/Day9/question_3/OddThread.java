package Day9.question_3;

public class OddThread implements Runnable{

	@Override
	public void run() {

		for(int i=1; i<=20; i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}

}
