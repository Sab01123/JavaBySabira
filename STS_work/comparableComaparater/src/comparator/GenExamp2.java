package comparator;

public class GenExamp2 {
	
	public static <T> void fun1(T[] t) {
		for(T i: t) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		Integer[] in = {10,20,30,40};
		String[] str = {"sab", "aab","dab"};
		
		fun1(in);
		fun1(str);
	}

}
