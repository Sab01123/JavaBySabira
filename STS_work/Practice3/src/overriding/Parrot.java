package overriding;

public class Parrot extends Bird {
	@Override
	public void fly() {
		System.out.println("I am flying");
	}

	public void sing() {
		System.out.println("I am singing");
	}

}
