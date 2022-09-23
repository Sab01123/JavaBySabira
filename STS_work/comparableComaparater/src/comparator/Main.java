package comparator;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		StudentComp stc = new StudentComp();
		
		TreeSet<Student> ts =new TreeSet<>(stc);
		
		ts.add(new Student(1, "sab", 550));
		ts.add(new Student(2, "aab", 450));
		ts.add(new Student(3, "rab", 150));
		ts.add(new Student(4, "dab", 650));
		ts.add(new Student(5, "lab", 950));
		ts.add(new Student(6, "zab", 250));
		
for(Student i:ts) {
	System.out.println(i);
}
		
		
	}

}
