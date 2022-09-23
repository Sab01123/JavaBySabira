package overriding;

public class Dog extends Animal{

	@Override
	public void makeNoise() {
		System.out.println("Barking...");
	}
}
