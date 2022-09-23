package com.question_1;


public class Main {

	public static Object []  changeArray(Object [] arr){
		 int c = 0;
		 for(Object s:arr) {
			 if(s instanceof Student) {
				 Student s1 = (Student)s;
				 s1.setMarks(s1.getMarks()+10);
				 arr[0] = s1;
			 }
			 else if(s instanceof Employee) {
				 Employee el = (Employee)s;
				 el.setSalary(el.getSalary()+1000);
			 }
			 else if(c==2) {
				 StringBuilder s1 = new StringBuilder((String)s);
				 s1.reverse();
				 arr[2] = s1.toString();
			 }
			 else {
				 int k = (int)s+20;
				 arr[3] = k;
			 }
			 c++;
		 }
		 return arr;
	 }
	
	public static void main(String[] args) {

	Object[] a = new Object[4];
	a[0] = new Student(23, "rakesh", 450);
	a[1] = new Employee(12, "lokesh", 84000);
	a[2] = "sabira";
	a[3] = 50;
	
	Object[] ans = changeArray(a);
	for(Object i:ans) {
		System.out.println(i);
	}

	}

}
