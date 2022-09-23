package com.question_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void fun1(List<? super Integer> i) {
		
		for(Object o:i) {
			System.out.println(o);
		}
	}
	

	public static void main(String[] args) {

		List<Integer> li = Arrays.asList(10,20,30,40);
		fun1(li);
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("enter number of elements");
//		int n  = sc.nextInt();
//		
//		int [] array  = new int[n];
//		System.out.println("Enter elements");
//		
//		for(int i=0; i<n; i++) {
//			array[i] = sc.nextInt();
//		}
//List<Integer> lu	=new ArrayList<>();

//		String str = sc.nextLine();
   
//		List<Character> chars = new ArrayList<>();
//		for(char ch:str.toCharArray()) {
//			chars.add(ch);
//		}
		
//		fun1(chars);
//		char[] ch = new char[str.length()];
//		for(int i=0; i<str.length();i++) {
//			ch[i] = str.charAt(i);
//		}
//		for(char c:ch) {
//			System.out.println(c);
//		}
//		char[] ch = str.toCharArray();
//		fun1(ch);
//		System.out.println(s);
//		int [] arr = new int[s.length()];
//		for(int i=0; i<s.length(); i++) {
//			
//		}
	
		
		
	
//		fun1(s);
	}

}
