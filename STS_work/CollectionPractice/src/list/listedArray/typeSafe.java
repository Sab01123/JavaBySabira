package list.listedArray;

import java.util.ArrayList;

public class typeSafe {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		
		a.add("delhi");
		a.add("mumbai");
		a.add("patna");
		a.add("kashmir");
		
		System.out.println(a);
		
		System.out.println(a.get(1).toUpperCase()); //MUMBAI
		
		//-the above type safe collection concept is called Genrics concept

	}
	

	
}
	
