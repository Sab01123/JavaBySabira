package comparable;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		TreeSet<Student> ts = new TreeSet<>();
		
		ts.add(new Student(1, "sab", 110));
		ts.add(new Student(2, "aab", 510));
		ts.add(new Student(3, "zab", 110));
		ts.add(new Student(4, "pab", 210));


		for(Student i:ts) {
			
			System.out.println(i);
		}

		/*output
		 * Student [roll=1, name=sab, marks=110]
Student [roll=4, name=pab, marks=210]
Student [roll=3, name=dab, marks=310]
Student [roll=2, name=aab, marks=510]
		 */
	}

}
