package com.practice;

public class Lion {
	String name;
	boolean isHungry;
	int age;
	static int totalDeaths;
	public Lion() {
		// TODO Auto-generated constructor stub
	}

   public Lion(String name, boolean isHungry, int age) {
		super();
		this.name = name;
		this.isHungry = isHungry;
		this.age = age;
	}

public static void printKillings() {
	   System.out.println("Total killings by lions in jungle = "+totalDeaths);
    }
 public void thinking() {
	 if(isHungry==false)
	 {
		 System.out.println(name+" is sleeping;");
	 }
	 else if(isHungry==true && age>12)
	 {
		 totalDeaths = totalDeaths+2;
		 System.out.println(name+"has eaten two\r\n"
		 		+ "animal");
	 }
	 printKillings();
 }
	public static void main(String[] args) {

		 Lion obj1 = new Lion("baba",false,23);
//		 obj1.age = 12;
//		 obj1.isHungry = false;
//		 obj1.name = "babarshair";
		 
		 Lion obj2 = new Lion();
		 Lion obj3 = new Lion();
		 
		obj1.thinking();
		
	}

}
