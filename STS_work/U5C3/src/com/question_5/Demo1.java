package com.question_5;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) throws Exception {

     List<Student> list = new ArrayList<>();
     list.add(new Student(1, "sabira", 500, "sab@gmail.com", "123", new Address("jk", "srinagar", "123456")));
     list.add(new Student(2, "ayzal", 400, "aay@gmail.com", "111", new Address("bihar", "patna", "123456")));
     list.add(new Student(3, "mohammad", 550, "moh@gmail.com", "222", new Address("delhi", "new", "123456")));
     list.add(new Student(4, "haleef", 380, "hal@gmail.com", "145", new Address("kashmir", "srinagar", "123456")));
     list.add(new Student(5, "zainab", 600, "zai@gmail.com", "888", new Address("punjab", "chandhigarh", "123456")));

     
FileOutputStream fos = new FileOutputStream("studentdata.txt");
ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("studentdata.txt"));
	
oos.writeObject(list);
oos.close();
		
	System.out.println("Serializetion Done..");	
		
	}

}
