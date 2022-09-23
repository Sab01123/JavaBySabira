package comparable;

public class Student implements Comparable<Student>{

   private int roll;
	private String name;
	private int marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	

	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}




	public int getRoll() {
		return roll;
	}




	public void setRoll(int roll) {
		this.roll = roll;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getMarks() {
		return marks;
	}




	public void setMarks(int marks) {
		this.marks = marks;
	}




	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}


//sort students based on marks
//	@Override
//	public int compareTo(Student o) {
//		// TODO Auto-generated method stub
//		Student s1 = this;
//		Student s2 = (Student) o;
//		
////		if(s1.getMarks()>s2.getMarks()) {
////			return +1;
////		}
////		else if(s1.getMarks()<s2.getMarks()) {
////			return -1;
////		}
////		else {
////			return 0;
////		}
//		
//		return s1.getMarks()>s2.getMarks() ? +1 :-1;
//		
//	}

	
	//sort students based on name
	
//	@Override
//	public int compareTo(Student o) {
//		
//		return this.getName().compareTo(o.getName());
//	}

	//sort students based on name reverse order
//	
//	@Override
//	public int compareTo(Student o) {
//		
//		return o.getName().compareTo(this.getName());
//		
//	}
	
	// if Marks are same then sort them according to thier name:
	
//	@Override
//	public int compareTo(Student o) {
//		if(this.getMarks()>o.getMarks())
//			return +1;
//		else if(this.getMarks()<o.getMarks())
//			return -1;
//		else
//			return this.getName().compareTo(o.getName());
//
//	}




}
