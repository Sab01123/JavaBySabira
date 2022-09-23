package problem3;

public class Student {
	 int roll;
	String name;
	 int marks;
	 
	 void displayStudentDetails() {
		System.out.println( "Roll is :" + roll);

			System.out.println(" Name is :"+ name);

			System.out.println(" Marks is :" + marks);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj1 = new Student();
		Student obj2 = new Student();
		obj1.name = "sabira";
		obj1.roll = 12;
		obj1.marks = 33;
		
		obj2.name = "sabira";
		obj2.roll = 24;
		obj2.marks = 41;
		
		obj1.displayStudentDetails();
		obj2.displayStudentDetails();
     }
}
