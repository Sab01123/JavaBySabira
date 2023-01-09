package com.masai;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
        List<Student> stu = Arrays.asList(
        		new Student(1, 100),
        		new Student(2, 300),
        		new Student(3, 500),
        		new Student(4, 200),
        		new Student(5, 400)
        		);
        
        List<Employee> emp = Arrays.asList(
				new Employee(45000, "electric", "punjab"),
				new Employee(45000, "java", "delhi"),
				new Employee(45000, "mern", "kashmir"),
				new Employee(45000, "cse", "gao"),
				new Employee(45000, "civil", "agra")
				
				);
        
        
        FileOutputStream fio = new FileOutputStream("abs.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fio);
        oos.writeObject(stu);
        oos.writeObject(emp);
        
        System.out.println("done");
     
        FileInputStream fis = new FileInputStream("abs.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);  
        
    Object obj =    ois.readObject();
        
    List<Student> stuList=   (List<Student>)obj;
        
    System.out.println(stuList);
    List<Employee> empList = (List<Employee>)obj;
    System.out.println(empList);
    System.out.println("done");
	}
	
	

}
