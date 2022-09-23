package exceptionHandlingPack;

public class MultipleCatch {

	public static void main(String[] args) {

		
System.out.println("inside main of Demo");
		
		try {
		String s1= "100";
		String s2= "10";
		
		A a1=null;
		
		int num1= Integer.parseInt(s1);
		int num2= Integer.parseInt(s2);
		
		int z = num1/num2;
		
		if(z > 5)
			a1=new A();
		
		
		a1.fun1();
		
		
		}catch (ArithmeticException ae) {
			System.out.println("inside AE");
		}
		catch (NullPointerException npe) {
			System.out.println("inside NPE");
		}
		catch (NumberFormatException nfe) {
			System.out.println("inside NFE");
		}
				
		
		System.out.println("end of main...");
		
		
	}

}
