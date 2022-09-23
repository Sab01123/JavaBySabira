package com.question_5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("studentdata.txt");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		List<Student> list = (List<Student>) ois.readObject();
		
//		list.forEach(s->System.out.println(s));
		
		list.add(new Student(22, "ahti", 100, "ahti@gmail.com", "786", new Address("assam", "xyz", "1234")));
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("studentdata.txt"));
		oos.writeObject(list);
		list.forEach(s->System.out.println(s));
		
		
System.out.println("Deserialization done...");
		
	}

}
