package interfacee.parameter;

public class Main {
	
	public void funMain(A a1) {
		
	if(a1 != null) {
		a1.fun1();
		a1.fun2();
		((B) a1).fun3();
	}
	else {
		System.out.println("null is not allowed");
	}
	
	}

	public static void main(String[] args) {

		Main m1 = new Main();
		m1.funMain(new B());
		
		
	}

}
