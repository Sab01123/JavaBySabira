package eval;

import java.util.Scanner;

public class Str {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("enter the string");
String string = scanner.next();
char[] chr = string.toCharArray();
System.out.println("enter character position you want to excess ");
int position = scanner.nextInt();
//System.out.println("Character at position" + position+" is :" + String.charAt(position));
for(int i=0; i<chr.length; i++) {
	if(chr[i]==position) {
		System.out.println("character at position is "+ chr[i]);
	}
//	else if(position!=chr[i]) {
//		System.out.println("cannot found character");
//	}
}
	}

}
