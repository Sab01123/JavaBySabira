package problem2;

public class ArrayMain extends Student {

	public static void main(String[] args) {
//		Student[] students = {new Student(10,"Ram"),new Student(20,"Ramesh"),new Student(40,"Amit")};
Student s1 = new Student();
    Student [] students = new Student[3];
    students[0] = new Student(10, "ram");
    students[1] = new Student(20, "sham");
    students[2] = new Student(30, "sab");
    
    for(int i=0; i<students.length; i++) {
    	
   	s1.printDetails(students[i]);
    }

	}

}
