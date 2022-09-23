package functionalProg;

import lemdaExpWithReturn.Student;

public abstract class MyPredicate<T> implements Predicate<Student>{

	@Override
	public boolean test(Student s) {
		return s.getMarks()>500;
	}

}
