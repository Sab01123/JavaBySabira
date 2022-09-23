package com.question_4;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) throws Exception {


		FileInputStream fis = new FileInputStream("studentdata.txt");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		List<Student> list = (List<Student>) ois.readObject();
		
		list.forEach(s-> System.out.println(s));
		
		//to add more student
//		list.add(new Student(20, "sabaa", 500, new Address("delhi", "del", 11110)));
//		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e://myFile.txt"));
//		oos.writeObject(list);
		System.out.println("done");
		
	}

}
