package com.question_3;

public class Main {
	
	public static int fun1(String str) {
		
		int i = Integer.parseInt(str);
		return i;
		
	}

	public static void main(String[] args) {

		String s1 = "25";
		Main.fun1(s1);
		
		X x1 = Main::fun1;
		System.out.println(x1.convetStringToNumber(s1)+25);
		
		X x2 = Integer::parseInt;
		System.out.println(x2.convetStringToNumber("30")+30);
		
		//LE
		X x3 = s-> Integer.parseInt(s);
       System.out.println(x3.convetStringToNumber("100")+100);		
		
	}

}
