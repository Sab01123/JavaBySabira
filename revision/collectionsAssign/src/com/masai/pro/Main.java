package com.masai.pro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ServiceImpl s = new ServiceImpl();

		List<Student> listOfStu = new ArrayList<>();
		listOfStu.add(new Student("aman", 500, "B", new Address("add1", "city1", "133311")));
		listOfStu.add(new Student("abhi", 400, "C", new Address("add3", "city3", "333311")));


		Scanner sc = new Scanner(System.in);
		System.out.println(" press 1 to add");
		System.out.println(" press 2 to delete");
		System.out.println(" press 3 to find");
		System.out.println(" press 4 to find Student With Pincode");
		System.out.println(" press 5 to sort With Name");
		System.out.println(" press 6 to set of marks");
		System.out.println(" press 7 to add all students");


		int opt = sc.nextInt();

		switch(opt) {
		case 1:
			System.out.println(s.addStudent(new Student("sabira", 100, "A", new Address("srinagar", "kashmir", "11111"))));

			break;

		case 2:
			System.out.println(s.deleteStudent(0));
			break;
		case 3:
			System.out.println(s.findStudent(0));
			break;
		case 4 :
			System.out.println(s.findStudentWithPincode("133311"));
			break;
		case 5 :
			System.out.println(s.sortWithName());
			break;
		case 6 :
			System.out.println(s.setOfMarks());
			break;
		case 7 :
			System.out.println(s.addAllStudents(listOfStu));
			break;
		default :
			System.out.println("Wrong option selected");

		}

	}
}

