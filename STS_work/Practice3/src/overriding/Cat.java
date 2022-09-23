package overriding;

public class Cat extends Animal {

	@Override
	public void makeNoise() {
		System.out.println("Meaw...");
	}
}
