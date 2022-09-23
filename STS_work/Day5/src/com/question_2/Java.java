package com.question_2;

public class Java {
	void Check(char n){

	if(n=='a' || n=='e' || n=='i' || n=='o' || n=='u' || n=='A' || n=='E' || n=='I' || n=='O' || n=='U') {
		System.out.println("character is vowel");
	}
	else if(n=='b' || n=='c' || n=='d' || n=='f' || n=='g' || n=='h' || n=='j' || n=='k' || n=='l' || n=='m' || n=='n' || n=='p' || n=='q' || n=='r' || n=='s' || n=='t' || n=='v' || n=='w' || n=='x' || n=='y' || n=='z' ||
			n=='B' || n=='C' || n=='D' || n=='F' || n=='G' || n=='H' || n=='J' || n=='K' || n=='L' || n=='M' || n=='N' || n=='P' || n=='Q' || n=='R' || n=='S' || n=='T' || n=='V' || n=='W' || n=='X' || n=='Y' || n=='Z')
	{
		System.out.println("character is consonant");
	}
	else {
		System.out.println("error");
	}
	}
public static void main(String[] args) {
	Java obj1 = new Java();
	obj1.Check('a');
	obj1.Check('b');
	obj1.Check('$');
}
}
