package com.masai.pro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class ServiceImpl implements Service{

	
static	List<Student> studentList = new ArrayList<>();
{
	studentList.add(new Student("cccccc", 100, "A", new Address("srinagar", "kashmir", "11111")));
	studentList.add(new Student("zaleef", 500, "B", new Address("ladakh", "gggg", "144111")));
	studentList.add(new Student("aaaaa", 300, "B", new Address("delhi", "asa", "333330")));

}
	
	@Override
	public List<Student> addStudent(Student stu) {

		Random rand = new Random();
		int roll =   rand.nextInt(1000);
		stu.setId(roll);
		studentList.add(stu);
		
		return studentList;
	}

	@Override
	public Student deleteStudent(int stuId) {
		int index = -1;
		for(Student i: studentList) {
			if(i.getId()==stuId) {
			index =	studentList.indexOf(i);
			}
		}
		Student s = studentList.get(index);
		studentList.remove(index);
		return s;
	}

	@Override
	public Student findStudent(int stuId) {
		for(Student i:studentList) {
			if(i.getId()==stuId) {
				return i;
			}
		}
		return null;
	}

	@Override
	public List<Student> findStudentWithPincode(String pincode) {
			List<Student> stuWithPin = new ArrayList<>();

		for(Student i:studentList) {
			if(i.getAddress().getPincode().equals(pincode)) {
				stuWithPin.add(i);
			}
		}		
		return stuWithPin;
	}

	@Override
	public List<Student> sortWithName() {

    Collections.sort(studentList,new StudentSortByName());
		
		return studentList;
	}

	@Override
	public List<Student> setOfMarks() {
       
		Set<Student> set= new HashSet<>();
//		set.forEach(null);
		
		return null;
	}

	@Override
	public List<Student> addAllStudents(List<Student> stu) {

		for(Student i:stu) {
			studentList.add(i);
		}
		return studentList;
	}

}
