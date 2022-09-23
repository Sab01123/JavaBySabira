package exceptionHandlingPack;

public class Deno {

	public static void main(String[] args) {

		System.out.println("start of demo");
		
		try {
			
			int i = 100;
			int j = 0;
			
			int z = i/j;
			
			System.out.println(z);
			
			
			
		} catch(ArithmeticException ae) {
//			System.out.println("inside catch");
//			System.out.println(ae);//java.lang.ArithmeticException: / by zero
System.out.println(ae.getMessage());/// by zero
//			ae.printStackTrace();//java.lang.ArithmeticException: / by zero
	//at exceptionHandlingPack.Deno.main(Deno.java:14)
		
		}

		
		System.out.println("end of demo");
		
		
		
		
		
	}

}
