package comparator;

public class GenEx3 {

//	public static <K,V>void fun1(K k, V v){
//		System.out.println(k+"=="+v);
//	}
//	
//	public static void main(String[] args) {
//fun1(1, "sabira");
//		fun1("sab", 2);
//		
//		fun1(10, new Student(3, "aab", 100));
//	}

	
	//with return type:
	public static <K,V> V func1(K k, V v) {
		return v;
	}
	
	public static void main(String[] args) {
	String str =	func1(10, "sabira");
	System.out.println(str);
	}
	
}
