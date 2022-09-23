package problem2;

public class Student {
 public  int roll_no;
  public String name;
  public Student() {
	// TODO Auto-generated constructor stub
}
public Student(int roll_no, String name) {
	super();
	this.roll_no = roll_no;
	this.name = name;
}
 public void printDetails(Student s) {
    System.out.println("Roll number is : "+s.roll_no+" Name is : "+ s.name);
}
  
}
