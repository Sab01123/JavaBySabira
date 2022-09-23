package lemdaExpWithReturn;

public class Demo2 {
	
	void fun2(Intr2 i2) {
		i2.fun1();
	}
	
	public static void funx() {
		System.out.println("hello");
	}

	public static void main(String[] args) {

		Demo2 demo2 = new Demo2();
		demo2.fun2(()->System.out.println("hiii"));
	//MR
		//LE
		Inter3 i = ()->System.out.println("welcome");
		i.fun3();
		
		//MR
		
		Inter3  i2 = Demo2::funx;
		i2.fun3();
		
		//if not static
//		Inter3 inter3 = new Demo2()::funx;
//		inter3.fun3();
		
	}

}
