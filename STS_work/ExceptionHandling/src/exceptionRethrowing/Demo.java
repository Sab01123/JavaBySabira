package exceptionRethrowing;

public class Demo {
	
	
	public void fun1(int i, int j) throws InvalidAge {
		try {
			
			int result = i/j;
			System.out.println(result);
			
		} catch (ArithmeticException are) {
System.out.println(are.getMessage());		
InvalidAge ia = new InvalidAge("age is not valid");
throw ia;
		}
	}

	public static void main(String[] args) {


		Demo d1 = new Demo();
		try {
			d1.fun1(10, 'a');
		} catch (InvalidAge e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
