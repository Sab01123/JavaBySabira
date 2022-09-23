package com.question_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

	BufferedWriter bw = new BufferedWriter(new FileWriter("f://abc.txt")); 
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter Employee Name");
	String name = br.readLine();
	
	System.out.println("Enter Employee Address");
	String address = br.readLine();
	
	bw.write(name);
	bw.newLine();
	bw.write(address);
	
	bw.flush();
	bw.close();
	
	System.out.println("Details added Thank you");
		
	}

}
