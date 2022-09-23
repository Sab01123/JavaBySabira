package overriding;

public class Main {

	public static void main(String[] args) {

//		Main m = new Main();
		Bird b1 = new Parrot();
		b1.fly();
		((Parrot)b1).sing();
	}

}
