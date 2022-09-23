package inheritance.problem2;

public class Demo extends Parent{

	int x = 100;
	
	void funcx() {
		System.out.println("inside funcx "+ x);
	}
	public Demo() {
		super(10);
		System.out.println("inside constructor of demo with super hehe");
	}
	public static void main(String[] args) {
     Demo d = new Demo();
     
     d.funcx();
     d.funxparent();
	}

}
