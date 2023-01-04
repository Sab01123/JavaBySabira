package com.masai.pro;

import java.util.List;

public interface Service {

	
	public List<Student> addStudent(Student stu);
	
	public Student deleteStudent(int stuId);
	public Student findStudent(int stuId);
	public List<Student> findStudentWithPincode(String pincode);
	public List<Student> sortWithName();
	public List<Student> setOfMarks();

	public List<Student> addAllStudents(List<Student> stu);

	
//	        addStudent() - This method should add provided student object on collection (choose
//			the collection as best fit List/LinkedList). Student id should be randomly generated and
//			method should return it bundled with student object.
//			deleteStudent() - This should take studentId in input and remove that associated
//			student object from collection
//			findStudent() - This method should return student based on provided studentId
//			findStudentWithPincode() - This method should take city pincode as input and should
//			return collection of students with that address
//			sortWithName() - define a method which should return collection of sorted student with
//			respect to name
//			setOfMarks() - define a method which should return collection of unique marks
//			obtained by all students (duplicates should be omitted)
//			addAllStudents() - define a method which should take collection of Student object in
//			parameter and add them in available collection of students. This method should also
//			maintain the order of students with respect to obtained marks.
}
