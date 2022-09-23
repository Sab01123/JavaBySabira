package nestedExceptionHandling;

public class Demo {

	public static void main(String[] args) {


		System.out.println("start of demo");
		try {
			
			System.out.println("start of try1");
			System.out.println(100/0);
			try {
				
				System.out.println("start of try2");
				
				A a1 = new A();
				a1.fun1();
				System.out.println("end of try2");
				
			} catch (NullPointerException npe) {
System.out.println("inside catch of try2");			}
			
		} catch (Exception e) {
System.out.println("inside catch of try1");		
}
		System.out.println("end of main");
	}

}
