package Printerwriter;

import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException {

	PrintWriter pw = new PrintWriter("f://abc.txt");
	
	pw.println(100);
	pw.println("sab");
	
	pw.close();
	
	System.out.println("done");
		
	}

}
