package inheritance.problem1;

public class Demo extends Java {
	int x = 100;
	void funcx() {
		System.out.println("inside funcx");
	}

	public static void main(String[] args) {
      Demo d = new Demo();
      
      System.out.println(d.x);
      
      System.out.println(d.i);

      d.funcx();
      d.funcA();

	}

}
