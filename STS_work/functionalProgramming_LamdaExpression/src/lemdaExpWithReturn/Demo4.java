package lemdaExpWithReturn;

public class Demo4 {
	
public static void funX(String n) {
		
		System.out.println("inside funX of Demo "+n);
		//5000
	}
	
	
	public void funY(String n) {
		
		System.out.println("inside funY of Demo "+n);
		//5000
	}
	
	
	public Demo4(String n) {
		System.out.println("inside constructor of Demo "+n);
	}
	
	public Demo4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Inter4 inter4 = n-> System.out.println("Hi " +n);
		inter4.sayHello("sab");
		
		Inter4 i1 = Demo4::funX;
		i1.sayHello("aab");
		
		Inter4 i2 = new Demo4()::funY;
		i2.sayHello("rab");
		
		//package lemdaExpWithReturn;
//		@FunctionalInterface
//		public interface Inter4 {
//		void sayHello(String name);
//		}
		
		
	}

}
