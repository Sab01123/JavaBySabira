package interfacee.method;

public class Demo {
	
	public A funDemo() {
		 return new B();
	}

	public static void main(String[] args) {

		Demo d1 = new Demo();
		
	A a1 = 	d1.funDemo();
		if(a1!=null) {
			a1.fun1();
			a1.fun2();
			((B) a1).fun3();
		}
		else {
			System.out.println("returning null value");
		}
	}

}
