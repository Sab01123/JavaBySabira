package com.question_4;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) throws Exception {

		
		List<Student> list = new ArrayList<>();
		list.add(new Student(1, "sab", 100, new Address("jk", "srg", 190008)));
		list.add(new Student(2, "aab", 200, new Address("pk", "pun", 190002)));
		list.add(new Student(3, "dab", 300, new Address("rk", "del", 190003)));
		list.add(new Student(4, "zab", 400, new Address("dk", "pune", 190458)));
		list.add(new Student(5, "rab", 500, new Address("kk", "shimla", 190079)));

		FileOutputStream fos = new FileOutputStream("studentdata.txt");
		ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("studentdata.txt"));
		
		ois.writeObject(list);
		ois.close();
		
		System.out.println("done..");
	}

}
