package comparator;

public class GenericsWala {
	
	public static <T> void fun1(T t) {
		System.out.println(t);
	}

	public static void main(String[] args) {

	 fun1(10);
	 fun1("sabira");
	 fun1(new Student(1, "sab", 100));
	 
	}

}
