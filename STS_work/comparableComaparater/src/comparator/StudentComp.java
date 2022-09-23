package comparator;

import java.util.Comparator;

public class StudentComp implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		
		if(s1.getMarks()>s2.getMarks())
			return +1;
		else if(s1.getMarks()<s2.getMarks())
			return -1;
		else
			return 0;

		
	}

}
