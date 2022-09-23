package lemdaExpWithReturn;

public class Main {

	public static void main(String[] args) {

		StudentIntr stuintr = (r,n,m) -> new Student(r, n, m);
			
			
	System.out.println(stuintr.createStuObj(1, "sab", 100));
		
		
	}

}
