package list.listedArray;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		ArrayList<Student> arr = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		int count = 1;
		
		while(true) {
			System.out.println("Enter details of student "+(count++));
			
			System.out.println("Enter roll number");
			int roll  = sc.nextInt();
			
			System.out.println("Enter Name");
			String name = sc.next();
			
			System.out.println("Enter Marks");
			int marks  = sc.nextInt();
			
			Student stu = new Student(roll, name, marks);
			
			arr.add(stu);
			
			System.out.println("Student object added sucessfully...");
			
			System.out.println("Want more(y/n) ?");
			String choice = sc.next();
			
			if(choice.equalsIgnoreCase("n")) 
				break;
		
		}
		
		for(Student i:arr) {
			System.out.println("Roll is : "+ i.getRoll());
			System.out.println("Name is : "+ i.getName());
			System.out.println("Marks are : "+ i.getMarks());

			System.out.println("============================");
          
		}
		
	}

}
