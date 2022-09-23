package day10.question_6;

public class Callable implements java.util.concurrent.Callable<Integer>{

	int num;
	public Callable (int num) {
		this.num = num;
	}
	
	@Override
	public Integer call() throws Exception {
		
		for(int i=0; i<=num; i++) {
			if(i%2==0) {
				System.out.println(i+" Number is Even");
			}
			else if(i%2!=0) {
				System.out.println(i+" Number is odd");
			}
			
		}
		return num;
	}

}
