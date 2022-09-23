package overriding;

import problem2.Student;

public class AnimalMain {

	public static void main(String[] args) {

		Animal[] arr = new Animal[3];
		arr[0] =new Dog();
		arr[1] = new Cat();
		arr[2] = new Tiger();
		
		for(Animal i: arr) {
			i.eat();
			i.walk();
			i.makeNoise();
		}
	}

}
