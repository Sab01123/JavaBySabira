package mapsPack;

public class Student {

	private int marks;
	private String nameString;
	private int roll;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int marks, String nameString, int roll) {
		super();
		this.marks = marks;
		this.nameString = nameString;
		this.roll = roll;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	@Override
	public String toString() {
		return "Student [marks=" + marks + ", nameString=" + nameString + ", roll=" + roll + "]";
	}
	
}
