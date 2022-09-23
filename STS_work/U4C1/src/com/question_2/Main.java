package com.question_2;
public class Main {
	static void printMonths(String month) {
		switch(month) {
		case "JAN":
			System.out.println("This is the 1st Month of the Year January");
			break;
		case "FEB":
			System.out.println("This is the 2nd Month of the Year February");
			break;
		case "MAR":
			System.out.println("This is the 3rd Month of the Year March");
			break;
		case "APR":
			System.out.println("This is the fourth Month of the Year April");
			break;
		case "MAY":
			System.out.println("This is the fifth Month of the Year May");
			break;
		case "JUN":
			System.out.println("This is the sixth Month of the Year June");
			break;
		case "JUL":
			System.out.println("This is the seventh Month of the Year July");
			break;
		case "AUG":
			System.out.println("This is the eighth Month of the Year August");
			break;
		case "SEP":
			System.out.println("This is the nineth Month of the Year September");
			break;
		case "OCT":
			System.out.println("This is the tenth Month of the Year October");
			break;
		case "NOV":
			System.out.println("This is the eleventh Month of the Year November");
			break;
		case "DEC":
			System.out.println("This is the twelveth Month of the Year December");
			break;
		default: System.out.println("Not Found");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMonths("MAR");
	}

}
