package com.question_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Mobile {

	HashMap<String,ArrayList<String>> mobiles = new HashMap<>();
ArrayList<String> am = new ArrayList<>();
	
	public String addMobile(String company, String model) {
	if(mobiles.containsKey(company)) {
		mobiles.get(company).add(model);
	}
	else {
		ArrayList<String> li = new ArrayList<>();
		li.add(model);
		mobiles.put(company, li);
	}
	return "Mobile added successfully";
	}
	
	public List<String> getModels(String company){
		
		List<String> li = new ArrayList<>();
		if(mobiles.containsKey(company)) {
			li = mobiles.get(company);
		}
		return li;
		
	}

	public static void main(String[] sab) {
		
		Scanner sc = new Scanner(System.in);
		Mobile mobComp = new Mobile();
		while(true) {
			
			System.out.println("company name ");
			String cName = sc.next();
			System.out.println("model name");
			String mName = sc.next();
			
		System.out.println(mobComp.addMobile(cName, mName));
			System.out.println("want to add more");
			String yes = sc.next();
			if(yes.equalsIgnoreCase("n")) {
				break;
			}
			
			
		}
		System.out.println("name of company");
		String comName = sc.next();
		List<String> modelname = mobComp.getModels(comName);
		
		System.out.println(modelname);
	}

	@Override
	public int hashCode() {
		return Objects.hash(mobiles);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mobile other = (Mobile) obj;
		return Objects.equals(mobiles, other.mobiles);
	}
	
	
	
}
